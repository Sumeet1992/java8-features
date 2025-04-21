package com.java8.seventh_sequential_streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreams {

    public static void main(String[] args) {
        // 1. FindFirst gets the first element that it matches
        Stream stream = Stream.of("Sumeet", "Sum", "Tim", "Peter");
        stream.findFirst().ifPresent(System.out::println);
        System.out.println("----------------------------------");

        // 2. Using ifPresentOrElse
        Arrays.asList("a1","a2","a3","a4","a5")
                .stream()
                .filter(x -> x.equals("a6"))
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("No match found..!!"));

        System.out.println("----------------------------------");

        // 3. Range:
        IntStream.range(1,11).forEach(x -> System.out.print(x + " "));

        System.out.println();
        System.out.println("----------------------------------");

        // 4. Perform any operation on an integer array
        Arrays.stream(new int[] {1,2,3,4,5})
                .map(n -> n*2)
                .average()
                .ifPresent( x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("----------------------------------");

        // 5. String data objects
        Stream.of("a1","a2","a3","a4","a5")
                .map( s -> s.substring(1))
                .mapToInt(x -> Integer.parseInt(x))
                .forEach( x -> System.out.print(x + " "));

        System.out.println();
        System.out.println("----------------------------------");

        // 6. Double to String objects
        Stream.of(1.0, 2.0, 3.0, 4.0, 5.0)
                .mapToInt(Double::intValue)
                .mapToObj(x -> "a" + x)
                .forEach( x -> System.out.print(x + " "));

        System.out.println();
        System.out.println("----------------------------------");

        // 7. limit
        IntStream.iterate(0, n -> n + 1).limit(10).forEach( x -> System.out.print(x + " "));

        System.out.println();
        System.out.println("----------------------------------");

        // 8. Odd numbers: Print first 10 odd numbers
        Stream.iterate(0, n-> n+1)
                .filter( n-> n%2 != 0)
                .limit(10)
                .forEach( n -> System.out.print(n + " "));
    }

}
