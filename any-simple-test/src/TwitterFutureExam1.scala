import com.twitter.util.FuturePool

/**
 * @see https://medium.com/@knoldus/twitter-future-in-scala-927d1162f324
 */
object TwitterFutureExam1 extends App{

  val unboundedPool = FuturePool.unboundedPool
  println("1 - starting calculation ...")
  def getValue =  42

  def increment(number: Int)=number+1

  val incrementByGettingValue = unboundedPool {
    increment(getValue)
  }

  println("2- before onSuccess")
  incrementByGettingValue.onSuccess{
    case value => println("Got the callback "+value)
  }
  println("A ...")
  println("B ...")
  println("C ...")
  println(incrementByGettingValue.poll)
}