package com.java8.fifth_Streams;

import java.util.Arrays;
import java.util.List;

public class FindAnyAndOrElse {

    public static void main(String[] args) {

        List<Customer> customerList = Arrays.asList(
                new Customer("Sumeet", 32),
                new Customer("Sam", 31),
                new Customer("Peter", 23),
                new Customer("Peter", 35)
        );

//        1. Filter with findAny where condition matches
        Customer cust1 = customerList
                .stream() // This converts the list into a stream
                .filter(customer -> "Peter".equals(customer.getName())) // This filters based on the condition.
                .findAny() // This returns the first object that matches the condition
                .orElse(null); // If it doesn't match teh condition then it returns whatever is inside this orElse method

        System.out.println(cust1);

        System.out.println("---------------------------");

//        2. Filter with findAny where condition does not match. So it goes to orElse
        Customer cust2 = customerList
                .stream() // This converts the list into a stream
                .filter(customer -> "Sum".equals(customer.getName())) // This filters based on the condition.
                .findAny() // This returns the first object that matches the condition
                .orElse(null); // If it doesn't match teh condition then it returns whatever is inside this orElse method

        System.out.println(cust2);

        System.out.println("---------------------------");

//        3. Filter with multiple conditions

        Customer cust23 = customerList
                .stream() // This converts the list into a stream
                .filter(customer -> "Peter".equals(customer.getName()) && 35 == customer.getAge()) // This filters based on the condition.
                .findAny() // This returns the first object that matches the condition
                .orElse(null); // If it doesn't match teh condition then it returns whatever is inside this orElse method

        System.out.println(cust23);

    }

}
