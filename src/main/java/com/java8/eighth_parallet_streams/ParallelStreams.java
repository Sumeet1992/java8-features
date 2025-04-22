package com.java8.eighth_parallet_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreams {

    public static void main(String[] args) {

//        Parallelism is achieved via ForkJoinPool
//        All the common threads are provided by the ForkJoinPool
//        Here, we are printing total how many cores we have in our machine.

        ForkJoinPool corePools = ForkJoinPool.commonPool();
        System.out.println(corePools.getParallelism());

        System.out.println("-------------------------------");

//        1. using parallel() method on stream :
//        Without parallel, elements are printed in sequential order
        Stream.of("Sumeet", "Raj", "Sam", "Tom", "Peter").forEach(x -> System.out.print(x + " "));
        System.out.println();
//        With parallel, elements are printed in random order because each are running in parallel
        Stream.of("Sumeet", "Raj", "Sam", "Tom", "Peter").parallel().forEach(x -> System.out.print(x + " "));

        System.out.println();
        System.out.println("-------------------------------");

//        2. Use parallelStream() method on a collection stream
        Arrays.asList("Sumeet", "Raj", "Sam", "Tom", "Peter").parallelStream().forEach(x -> System.out.print(x + " "));

        System.out.println();
        System.out.println("-------------------------------");
//         print 1 - 10

//        normal Stream
        IntStream.rangeClosed(1, 10).forEach(x -> System.out.print(x + " "));
        System.out.println();
//        parallel stream
        IntStream.rangeClosed(1, 10).parallel().forEach(x -> System.out.print(x + " "));

        System.out.println();
        System.out.println("-------------------------------");

//        print from a - z i.e. 97-122

//        sequential stream
        alphabetsList().stream().forEach(x -> System.out.print(x + " "));
        System.out.println();
        alphabetsList().stream().parallel().forEach(x -> System.out.print(x + " "));

        System.out.println();
        System.out.println("-------------------------------");

//        Check if stream is running in parallel
//        when running sequentially
        IntStream intStream = IntStream.rangeClosed(1,10);
        System.out.print(intStream.isParallel());
//        When running parallel
        System.out.println();
        IntStream intStream2 = IntStream.rangeClosed(1,10);
        intStream2.parallel();
        System.out.print(intStream2.isParallel());


    }

    public static List<String> alphabetsList(){
        List<String> alpha = new ArrayList<>();

        int currentChar = 97;
        while(currentChar <= 122){
            char c = (char) currentChar;
            alpha.add(String.valueOf(c));
            currentChar++;
        }
        return alpha;
    }

}
