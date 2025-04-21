package com.java8.fifth_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollectExamples {

    public static void main(String[] args) {

        List<String> productList = Arrays.asList("Macbook", "IPhone", "Shoes", "Battery", "Bat");

        productList.forEach(e -> System.out.println(e));

        System.out.println("----------------------");
//        Using Streams
//        This below filter excludes the product "Shoes" and fetches the other products
        List<String> resultList = productList.stream().filter( element -> !element.equals("Shoes")).collect(Collectors.toList());
        resultList.forEach(e -> System.out.println(e));

    }

}
