package com.java8.eighth_parallet_streams;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStreams {

    public static void main(String[] args) {

//        This is without parallel

        Instant start = Instant.now();

        long count = Stream.iterate(0, n -> n+1)
                .limit(1000000)
                .filter(x -> isPrime(x))
//                .peek(System.out::println)
                .count();

        Instant end = Instant.now();
        System.out.println("Sequential stream duration in milliseconds: " + Duration.between(start, end).getSeconds());

//        This is with Parallel
//        By doing it parallely, the time of execution drastically reduces for processing 1 million records

        Instant start1 = Instant.now();
        long countParallel = Stream.iterate(0, n -> n+1)
                .limit(1000000)
                .parallel()
                .filter(PrimeNumberWithParallelStreams::isPrime)
//                .peek(System.out::println)
                .count();

        Instant end1 = Instant.now();
        System.out.println("Parallel stream duration in milliseconds: " + Duration.between(start1, end1).getSeconds());

    }

    public  static boolean isPrime(int number){

        if(number <= 1){
            return false;
        }
//        This check if the number is divisible buy any other number between 2 and number/2
//        If yes, then it is not a prime since it should be divisible by only 1 and the number itself.
        return IntStream.rangeClosed(2, number/2).noneMatch(x -> number%x == 0);
    }

}
