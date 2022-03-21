package chapter4

import java.io.*

interface kState : Serializable
interface kView {
    fun getCurrentState(): kState
    fun restoreState(state: kState) {}
}

class kButton : kView {
    override fun getCurrentState(): kState = ButtonState()
    override fun restoreState(state: kState) { /*...*/ }
    class ButtonState : kState { /*...*/ }
}

fun main() {
    val state = kButton().getCurrentState()

    val file = File("./kButton.file")
    FileOutputStream(file).use { fos ->
        ObjectOutputStream(fos).use { oos ->
            oos.writeObject(state)
            oos.flush()
        }
    }
}