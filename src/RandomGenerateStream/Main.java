package az.coder.task1.RandomGenerateStream;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {
    static int i = 0;
    public static void main(String[] args) {


        //Task 1
        boolean b = Stream.generate(() -> new Random().nextInt(100)).peek(System.out::println).anyMatch(a -> a == 45);
        Stream.generate(() -> new Random().nextInt(100)).peek(System.out::println).filter(a -> a == 45).limit(4L).count();



        //Task 2
        Stream.iterate(3,a->a++).peek(a->System.out.println(a+"-")).map(a->Math.pow(a,i++)).limit(4).forEach(System.out::println);


    }
}
