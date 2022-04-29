/**
 * 람다식 내부에서 외부변수를 참조하고 있는 상황에서 외부변수의 값을 변경하면 어떻게 될까?
 */

@FunctionalInterface
interface FuncInterface {
    int func(int a);
}

public class LambdaEx {
    public static void main(String[] args) {
        int add = 1;
        FuncInterface ex = a -> a + add;

        System.out.println(ex.func(1));
//        add = 3;    // error. Variable used in lambda expression should be final or effectively final
    }
}
