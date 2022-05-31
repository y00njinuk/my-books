package appendix

import kotlinx.coroutines.*
import java.time.ZonedDateTime.now

fun log(msg:String) = println("${now()}:${Thread.currentThread()}: ${msg}")

fun sumAll() {
    runBlocking {
        val d1 = async {
            log("after async (d1) ")
            delay(1000L); 1
        }

        val d2 = async {
            log("after async (d2)")
            delay(2000L); 2
        }
        val d3 = async {
            log("after async (d3) ")
            delay(3000L); 3
        }

        log("1+2+3 = ${d1.await() + d2.await() + d3.await()} ")
        log("after await all & add")
    }
}

fun main() {
    sumAll()
}