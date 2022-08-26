package java.reflection;

import java.lang.reflect.Method;

/**
 * @see https://www.oracle.com/technical-resources/articles/java/javareflection.html
 */
public class ReflectionEx {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("java.util.Stack");
            Method m[] = c.getDeclaredMethods();

            for (int i=0; i<m.length; i++)
                System.out.println(m[i].toString());

        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}
