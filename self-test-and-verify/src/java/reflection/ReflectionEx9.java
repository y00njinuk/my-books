package java.reflection;

import java.lang.reflect.Array;

/**
 * @see https://www.oracle.com/technical-resources/articles/java/javareflection.html
 */
public class ReflectionEx9 {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("java.lang.String");
            Object arr = Array.newInstance(cls, 10);
            Array.set(arr, 5, "this is a test");

            String s = (String) Array.get(arr, 5);
            System.out.println(s);

        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}
