package com.java8.Second_Functional_Interface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcepts {

    public static void main(String[] args) {


        /* This is a functional interface
        *  and can therefore be used as the assignment target for a lambda expression or method reference.
        *  Represents an operation upon two operands of the same type, producing a result of the same type as the operands.
        *  This is  a specialization of the BiFunction for the case where the operands and the result are all of the same type.
        * */

        BinaryOperator<Integer> func1 = (x1, x2) -> x1 + x2;
        int func1Result = func1.apply(10, 20);
        System.out.println(func1Result);

//        We can also use Bifunction since BinaryOperator is a child class of Bifunction

        BiFunction<Integer, Integer, Integer> func2 = (x1, x2) -> x1 + x2;
        int func2Result = func2.apply(10, 20);
        System.out.println(func2Result);


    }

}
