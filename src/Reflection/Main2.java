package az.coder.task1.Reflection;

import java.lang.reflect.Constructor;

public class Main2 {
    class A {
        private int x;

        private A(int x) {
            this.x = x;
        }

        public int printValue() {
            return x;
        }
    }

    public static class B {
        public int createA() throws Exception {
            Class<A> aClass = A.class;
            Constructor<A> constructor = aClass.getDeclaredConstructor(int.class);
            constructor.setAccessible(true);
            A a = (A)constructor.newInstance(5);

            return a.printValue();
        }
    }

    public static void main(String[] args) throws Exception {
        B b = new B();
        System.out.println(b.createA());

    }
}
