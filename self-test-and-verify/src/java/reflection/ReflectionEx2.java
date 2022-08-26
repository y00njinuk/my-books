package java.reflection;

/**
 * @see https://www.oracle.com/technical-resources/articles/java/javareflection.html
 */
public class ReflectionEx2 {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("java.reflection.A");

            boolean b1 = cls.isInstance(37);
            System.out.println(b1);

            boolean b2 = cls.isInstance(new A());
            System.out.println(b2);

        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}

class A {}