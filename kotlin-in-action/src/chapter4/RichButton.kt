package chapter4

open class RichButton: Clickable {
    fun disable() { }           // not possible to overriding
    open fun animate() { }      // possible to overriding
    override fun click() { }    // overriding. possible to overriding to subclass.
}