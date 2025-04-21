package com.java8.fourth_lambda_exp_and_method_references;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpAndMethodReferences {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sumeet", "Tom", "Dick", "Harry");

//        With Anonymous class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("----------------------------");
//        With Lambda expression ->

        list.forEach( s -> System.out.println(s));
        System.out.println("----------------------------");

//        With Method references
        list.forEach(System.out :: println);
    }

}
