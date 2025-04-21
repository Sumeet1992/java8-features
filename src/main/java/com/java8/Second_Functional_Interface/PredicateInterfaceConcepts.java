package com.java8.Second_Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcepts {

    public static void main(String[] args) {
        /*
        * Represents a predicate (boolean-valued function) of one argument.
        * */

        Predicate<Integer> func1 = x -> x > 5;

        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> newNumList = numList.stream().filter(func1).toList();
        System.out.println(newNumList);

//        predicate with multiple conditions

        List<Integer> newList = numList.stream().filter(x -> x > 5 && x < 10).toList();
        System.out.println(newList);

//        Predicate with Negate i.e. we want to reverse the condition

        List<String> nameList = Arrays.asList("Sumeet", "Sumee", "Sum", "Su", "S", "Java", "Jav");
        Predicate<String> predicateFunc = x -> x.startsWith("Sum");

//        Below will give output as ["Sumeet", "Sumee", "Sum"]
        List<String> nameList1 = nameList.stream().filter(predicateFunc).toList();
        System.out.println(nameList1);

//        Below will negate the condition and give the ouput as ["Su", "S", "Java", "Jav"]
        List<String> nameList2 = nameList.stream().filter(predicateFunc.negate()).toList();
        System.out.println(nameList2);

    }

}
