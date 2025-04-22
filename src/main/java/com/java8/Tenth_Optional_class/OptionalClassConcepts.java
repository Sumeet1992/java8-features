package com.java8.Tenth_Optional_class;

import java.util.Optional;

public class OptionalClassConcepts {

//    Optional class is used basically for null checks

    public static void main(String[] args) {

        String[] s = new String[5];

        Optional<String> isNull = Optional.ofNullable(s[2]);
        if(isNull.isPresent()){
            System.out.println(s[2] + " Length is " + s[2].length());
        }
        else{
            System.out.println("Value not available");
        }

        s[2] = "Sumeet";
        Optional<String> isNull1 = Optional.ofNullable(s[2]);
        if(isNull1.isPresent()){
            System.out.println(s[2] + " Length is " + s[2].length());
        }
        else{
            System.out.println("Value not available");
        }

        isNull1.ifPresent(x -> System.out.println(x + " " + x.length()));

        Optional<String> nothing = Optional.empty();
        nothing.ifPresentOrElse( x -> System.out.println("It is not empty..!!"), () -> System.out.println("Bye..!!"));

    }

}
