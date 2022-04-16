import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperTest {

    @Test
    void test() {
        Paper paper = new Paper(297, 140);
        Object object = paper;

        assertInstanceOf(Paper.class, paper);
        assertInstanceOf(Object.class, paper);

        assertInstanceOf(Paper.class, object);
        assertInstanceOf(Object.class, object);
    }
}