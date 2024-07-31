package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        // Creating Stream with List<>
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));
        // output == [30, 40, 50, 100, 70]

        // Creating Stream with Stream.of
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));
        // output == ["Maria", "Alex", "Bob"]

        // Creating Stream with Stream.iterate
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));
        // output == [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]

        // Creating Stream with Fibonacci sequence
        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
        // output == [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]

    }
}
