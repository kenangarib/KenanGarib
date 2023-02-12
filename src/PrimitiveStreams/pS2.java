package az.coder.task1.PrimitiveStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class pS2 {
    public static void main(String[] args) {

        int[] a = new int[]{1,2,3,4,5,6};
        int[] b = new int[]{4,5,6,7,8};
        int[] c = kesisme(a,b);


        System.out.println(Arrays.toString(kesisme(a, b)));

    }
    public static int[] kesisme(int[] a, int[] b) {
        return Arrays.stream(a).distinct().filter(x -> Arrays.stream(b).anyMatch(y -> y == x)).toArray();
    }
}
