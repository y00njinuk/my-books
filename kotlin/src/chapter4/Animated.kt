package chapter4

abstract class Animated {
    abstract fun animate()
    open fun stopAnimating() { println("stopAnimating in Animate") }
    fun animateTwice() { println("animateTwice in Animate") }
}


class SubClassAnimated: Animated() {
    override fun animate() { println("animate in SubClassAnimated") }
    override fun stopAnimating() { println("stopAnimating in SubClassAnimated") }
}

fun main() {
    val ex = SubClassAnimated()
    ex.animate()
    ex.stopAnimating()
    ex.animateTwice()
}