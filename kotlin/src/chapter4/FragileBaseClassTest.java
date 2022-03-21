package chapter4;

class Super {
    private int counter = 0;
    void inc1() { this.inc2(); }
    void inc2() { counter++; }
}
class Sub extends Super {
    @Override
    void inc2() { inc1(); }
}

public class FragileBaseClassTest {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.inc2();
    }
}
