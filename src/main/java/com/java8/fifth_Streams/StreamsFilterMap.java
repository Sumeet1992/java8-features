package com.java8.fifth_Streams;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterMap {

    public static void main(String[] args) {

        List<Customer> customerList = Arrays.asList(
                new Customer("Sumeet", 32),
                new Customer("Sam", 31),
                new Customer("Peter", 23),
                new Customer("Peter", 35)
        );

//        Fetch only the name from a customer object using Map
        String name = customerList
                .stream()
                .filter(cust -> "Sumeet".equals(cust.getName()))
                .map(Customer::getName)// Instead of method reference, you can also write using lambda i.e. `x -> x.getName()`
                .findAny()
                .orElse(null);

        System.out.println(name);

        System.out.println("-----------------------");

//        Fetch all the name from the customer List
        List<String> custNameList = customerList
                .stream()
                .map(Customer :: getName)
                .toList();

        custNameList.forEach(System.out::println);

    }

}
