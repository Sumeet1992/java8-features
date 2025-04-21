package com.java8.Second_Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceConcepts {

    /*
    * Represents an operation that accepts a single input argument and returns no result.
    * So, it takes an argument and returns void.
    * Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
    *
    * */

    public static void main(String[] args) {

        Consumer<String> func = x -> System.out.println(x);
        func.accept("Sumeet");

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        list.forEach( x ->System.out.println(x));


    }

}
