package com.java8.ninth_infinite_streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {

    public static void main(String[] args) {

//        Infinite streams is used to generate infinite stream of data

//        1. using iterate()
//        static iterate(T seed, UnaryOperator<T> f)
//        return a stream -->> Stream<T>

        List<Integer> list = Stream.iterate(0, n -> n+1)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(list);

//        2. Using generate()
//        static generate(Supplier<T> s)
//        Suppose we want to print random numbers

        List<Integer> list2 = Stream.generate(() -> (new Random()).nextInt(100))
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(list2);


    }

}
