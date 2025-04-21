package com.java8.seventh_sequential_streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterOccurences {

    public static void main(String[] args) {

        String input = "Hello, World! 123";

        Map<Character, Long> charCounts = input.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter) // Only include letters
                .map(Character::toLowerCase) // Optional: count case-insensitively
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(charCounts);

    }

}
