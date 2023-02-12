package az.coder.task1.Annatation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<AntExmp> antExmpClass = AntExmp.class;
        Method method = antExmpClass.getDeclaredMethod("test");
        Ant ant = method.getAnnotation(Ant.class);
        System.out.println(ant.age());

    }
}
