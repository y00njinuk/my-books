package chapter4

internal open class TalkativeButton: Focusable {
    fun hi() = println("Hi!")                           // public
    internal fun start() = println("Start!")            // internal
    private fun yell() = println("Hey!")                // private
    protected fun whisper() = println("Let's talk!")    // protected
}

//fun TalkativeButton.giveSpeech() {
//    hi()
//    start()
//    yell()
//    whisper()
//}