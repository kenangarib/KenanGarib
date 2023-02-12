package az.coder.task1.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class main {
    public static void main(String[] args) {

        elebele elebele = new elebele();
        Class<? extends az.coder.task1.Reflection.elebele> elebeleClass = elebele.getClass();

        try {

            Class<?> elebeleClassFind = Class.forName("az.coder.task1.Reflection.elebele");
            Constructor<?>[] constructors = elebeleClassFind.getConstructors();
            Constructor<?>[] declaredConsrtuctors = elebeleClassFind.getDeclaredConstructors();


            Field[] fields = elebeleClassFind.getFields();
            Field[] declaredFields = elebeleClassFind.getDeclaredFields();

            Method[] methods = elebeleClassFind.getMethods();
            Method[] declaredMethods = elebeleClassFind.getDeclaredMethods();

            for (Constructor<?> c : constructors) {
                System.out.println("Constructor: " + c.getName());
            }
            for (Constructor<?> dc : declaredConsrtuctors) {
                System.out.println("Declared Constructor: " + dc.getName());
            }

            for (Field f : fields) {
                f.setAccessible(true);
                System.out.println("Fields: " + f.getName());
                System.out.println("Private Fields: " + f.get(elebele));

            }
            for (Field df : declaredFields) {
                System.out.println("Declared Fields: " + df.getName());
            }

            for (Method m : methods) {
                System.out.println("Methods: " + m.getName());
            }
            for (Method dm : declaredMethods) {
                System.out.println("Declared Fields: " + dm.getName());
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
