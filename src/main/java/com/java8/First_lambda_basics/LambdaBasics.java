package com.java8.First_lambda_basics;

public class LambdaBasics {
    public static void main(String[] args) {

//        Without using Lambda,
//        We have to create an anonymous class to implement the exact function of the interface method.
//        So, we don't need to create a separate class which implements the interface
//        and define the logic of the method in that class. We can directly do it using anonymous class.
//        If we have to create different object of the class again with different logic,
//        We have to write unnecessary code like below 2 objects having different logic.

//        WebPage w1 = new WebPage() {
//            @Override
//            public void header(String value, int age) {
//                System.out.println(" Value is : "+ value + " Age is : "+age);
//            }
//        };
//
//        WebPage w2 = new WebPage() {
//            @Override
//            public void header(String value, int age) {
//                System.out.println(" Value is : "+ value);
//            }
//        };

//        So Instead of writing the above repetitive code, we can write using lambda using ->

        WebPage w1 = (value, age) ->  System.out.println(" Value is : "+ value + " Age is : "+age);

        WebPage w2 = (value, age) -> System.out.println(" Value in uppercase : "+ value.toUpperCase());

        w1.header("Sumeet", 32);
        w2.header("Ambastha", 32);



    }
}
