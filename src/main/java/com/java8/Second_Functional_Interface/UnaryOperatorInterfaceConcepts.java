package com.java8.Second_Functional_Interface;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcepts {
    public static void main(String[] args) {

        /*
        * Represents an operation on a single operand that produces a result of the same type as its operand.
        * This is a specialization of Function for the case where the operand and result are of the same type.
        * */

        UnaryOperator<Integer> func1 = x -> x * 7;
        int func1Result = func1.apply(2);
        System.out.println(func1Result);

//        Same thing can be done with Function interface but we have to pass two parameter types

        Function<Integer, Integer> func2 = x -> x * 7;
        int func2Result = func2.apply(2);
        System.out.println(func2Result);

//        Apply UnaryOperator on a ArrayList

        List<String> languageList = new ArrayList<>();
        languageList.add("Java");
        languageList.add("Ruby");
        languageList.add("Python");

        System.out.println(languageList);

//        Suppose we want the output of the list to be something different
//        e.g. append Sumeet to each String in the list

        languageList.replaceAll( element -> element + " Sumeet");
        System.out.println(languageList);





    }
}
