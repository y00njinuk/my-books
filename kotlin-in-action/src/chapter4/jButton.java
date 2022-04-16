package chapter4;

import java.io.*;

interface jState extends Serializable {}
interface jView {
    jState getCurrentState();
    default void restoreState(jState state) {}
}

public class jButton implements jView {
    public jState getCurrentState() { return new ButtonState(); }
    public void restoreState(jState state) { /* ... */ }
    class ButtonState implements jState { /* ... */ }

    public static void main(String[] args) throws IOException {
        jState state = new jButton().getCurrentState();

        File file = new File("./jButton.file");
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(state);
            oos.flush();
        }
    }
}