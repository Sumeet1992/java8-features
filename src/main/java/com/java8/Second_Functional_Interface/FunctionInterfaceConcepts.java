package com.java8.Second_Functional_Interface;

import java.util.function.Function;

public class FunctionInterfaceConcepts {

    public static void main(String[] args) {

        /*
        * Represents a function that accepts one argument and produces a result.
        * Interface Function<T,R>
        * Type Parameters:
        * T - The type of the input to the function
        * R - The type of the result from the function
        *
        * This interface is used to create a function
        * */

        Function<String, Integer> func1 = x -> x.length();

        int len = func1.apply("This is Java8 tutorial");
        System.out.println(len);

//        Chaining function
//        We can chain one function to another function as well.
//        Here the output from the first function will be passed to the 2nd function

        Function<Integer, Integer> func2 = x -> x * 2;
        int result = func1.andThen(func2).apply("Sumeet");
        System.out.println(result);


    }

}
