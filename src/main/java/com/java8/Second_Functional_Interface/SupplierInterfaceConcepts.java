package com.java8.Second_Functional_Interface;

import java.util.function.Supplier;

public class SupplierInterfaceConcepts {

    /*
    * Represents a supplier of results.
    * There is no requirement that a new or distinct result be returned each time the supplier is invoked.
    * This is a functional interface whose functional method is get().
    * So, it takes no argument and returns a result.
    * */

    public static void main(String[] args) {

//        Here, since Supplier does not need any parameters.
//        So, we have given the lambda expression like this ()

        getText(() -> "Java");


    }

//    This is just some random custom method we have created which has a Supplier as a parameter.
//    To show how Supplier works
    public static void getText(Supplier<String> text){
        System.out.println(text.get());
    }

}
