package az.coder.task1.PrimitiveStreams;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class pS {
    public static void main(String[] args) {
        Stream<Integer> b = Stream.generate(() -> new Random().nextInt(100)).limit(10);
        IntSummaryStatistics sm = b.mapToInt(Integer::intValue).summaryStatistics();

        int min = sm.getMin();
        Integer max = sm.getMax();
        double avg = sm.getAverage();
        System.out.println(max + " " + min + " " + avg);


    }
}
