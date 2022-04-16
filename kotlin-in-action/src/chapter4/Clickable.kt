package chapter4

interface Clickable {
    fun click()
    fun showOff() = println("I'm a clickable")
}

class Button: Clickable {
    override fun click() {
        TODO("Not yet implemented")
    }
}