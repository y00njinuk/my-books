import com.twitter.finagle.service.Backoff
import com.twitter.finagle.util.{DefaultTimer, Rng}
import com.twitter.util.{Await, Duration, Future, Timer}

import java.util.concurrent.TimeUnit

object TwitterFutureExam2 extends App {
  implicit def retryExceptionHandler: Throwable => Boolean = { case _ => true }

  val startFuture : Future[Unit] = {
     throw new Exception("throw start future exception")
  }
  val rescueFuture : Future[Unit] = {
    throw new Exception("throw rescue future exception")
  }

  // Execute future
  Await.result(
    startFuture rescue {
      case e: Exception =>
        println("error occurred in future : " + e.printStackTrace())
        Retries.retry {
          rescueFuture
        }
    })
}

object Retries {
  // retry 사용하고자 할 때 아래와 같은 형태로 shouldRetry 함수를 정의하며
  // retry 대상이 되는 Exception 들만 true로 반환한다.
  val defaultShouldRetry: PartialFunction[Throwable, Boolean] = {
    case _: Exception => false
    case _ => false
  }
  val DEFAULT_RETRY = 3
  val defaultBackoff: Stream[Duration] = Backoff.exponential(Duration(1, TimeUnit.SECONDS), 2) take DEFAULT_RETRY // 1,2,4,8..

  implicit val timer: Timer = DefaultTimer.twitter

  def randomizedDelay(minDelay: Duration): Duration =
    minDelay + Duration.fromMilliseconds(Rng.threadLocal.nextInt(minDelay.inMilliseconds.toInt))

  def retry[A](fn: => Future[A])(implicit backoff: Stream[Duration] = defaultBackoff,
                                 shouldRetry: Throwable => Boolean): Future[A] = {
    fn rescue {
      case e if shouldRetry(e) =>
        backoff match {
          case wait #:: rest => Future.sleep(randomizedDelay(wait)) before retry(fn)(rest, shouldRetry)
          case _ => Future.exception(e)
        }
    }
  }
}
