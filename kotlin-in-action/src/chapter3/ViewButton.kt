package chapter3

// 1. Member Function
open class View { open fun click() = println("View Clicked.") }
class Button: View() { override fun click() = println("Button Clicked.") }

// 2. Extension Function
fun View.showOff() = println("I'm a View.")
fun Button.showOff() = println("I'm a Button.")

fun main() {
    val view: View = Button()
    view.click()    // Dynamic Dispatch -> "Button Clicked."
    view.showOff()  // Static Dispatch  -> "I'm a View."
}