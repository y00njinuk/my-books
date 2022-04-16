package chapter4

import java.util.*
import kotlin.collections.ArrayList

class SmartCastTest {}

open class Base {
    open val value: List<Int> = ArrayList()
}
class Derived : Base() {
    private var counter = 0
    override val value: List<Int>
        get() { return LinkedList() }
}

fun main() {
    fun printArrayList(list: List<Int>) { /* ... */ }
    val b = Derived()

    when(b.value) {
        // Smart cast to 'ArrayList<Int>' is impossible, because 'b.value' is a property that has open or custom getter
        is List -> printArrayList(b.value)
        else -> throw IllegalArgumentException("Unknown Expression")
    }
}