import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class BoxTest {
    @Test
    public void test() {
        Box box = new Box();
        box.set(1);

        Integer a = (Integer) box.get();
        String b = (String) box.get();
        // compiler is ok.
        // but, ClassCastException in run time.

        GBox<Integer> gbox = new GBox<Integer>();
        gbox.set(1);

        Integer a1 = (Integer) gbox.get();
        // Inconvertible types; cannot cast 'java.lang.Integer' to 'java.lang.String'
        // String b2 = (String) gbox.get();
    }
}