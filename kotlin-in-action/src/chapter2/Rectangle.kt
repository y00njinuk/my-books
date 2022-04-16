package chapter2

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean           // custom getter.
        get() { return height == width }

    val test = 1
}

fun main() {
    val rectangle = Rectangle(40, 20)

    rectangle.height	// public final Int
    rectangle.width 	// public final Int
    rectangle.isSquare	// private final Boolean
    rectangle.test
}