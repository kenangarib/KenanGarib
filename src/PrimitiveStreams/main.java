package az.coder.task1.PrimitiveStreams;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        /*IntStream intStream = IntStream.of(1,2,3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());*/

        /*var random = DoubleStream.generate(Math::random);
        var fr = DoubleStream.iterate(.5, d -> d/2);
        random.limit(3).forEach(System.out::println);
        fr.limit(3).forEach(System.out::println);*/

        /*IntStream count = IntStream.iterate(3, n -> n+1).limit(5);
        count.forEach(System.out::println);*/


        //Range()
        /*IntStream range = IntStream.range(5, 15);
        range.forEach(System.out::println);*/

        //RangeClosed()
        /*IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::println);*/

        //MapToInt  Normal streamden IntStrean e cevirmek ucun.
        /*Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(s -> s.length());
        intStream.forEach(System.out::println);*/

        /*Stream gg = Stream.of("BMW","Dodge","JEEP");
        gg.forEach(System.out::println);*/

        Optional<String> cguck1 = Optional.empty();
        System.out.println(cguck1.get());



    }
}
