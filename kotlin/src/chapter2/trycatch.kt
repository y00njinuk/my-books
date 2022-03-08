package chapter2

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader): Int? =
    try {
        val line = reader.readLine()
        Integer.parseInt(line)
    }
    catch(e: java.lang.NumberFormatException) {
        null
    }
    finally {
        reader.close()
    }



fun main() {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}