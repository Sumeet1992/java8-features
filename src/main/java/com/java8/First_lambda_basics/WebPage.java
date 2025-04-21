package com.java8.First_lambda_basics;

// functional Interface means that the interface can have only one abstract method.
// Lambda can be applied only on a functional interface.
//SAM - Single Abstract Method
// You can have a static method and a default method as well in a Functional Interface

@FunctionalInterface
public interface WebPage {

    void header(String value, int age);

}
