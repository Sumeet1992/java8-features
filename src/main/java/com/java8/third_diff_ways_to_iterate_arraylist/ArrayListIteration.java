package com.java8.third_diff_ways_to_iterate_arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIteration {

    public static void main(String[] args) {
        List<String> tvSeries = new ArrayList<>();
        tvSeries.add("Game of Thrones");
        tvSeries.add("Breaking Bad");
        tvSeries.add("Prison Break");
        tvSeries.add("The Walking Dead");
        tvSeries.add("The Big Bang Theory");

//        1. Using java8 with For Each loop and lambda expression
        tvSeries.forEach(tvShow -> System.out.println(tvShow));

        System.out.println("----------------------");

//        2. Using Iterator
        Iterator<String> it = tvSeries.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("----------------------");

//        3. Using Java8 lambda & iterator & forEachRemaining method
        Iterator<String> it1 = tvSeries.iterator();
        it.forEachRemaining(show -> System.out.println(show));

        System.out.println("----------------------");

//        4. Using For Each loop
        for(String s : tvSeries){
            System.out.println(s);
        }

        System.out.println("----------------------");
//        5. Using normal for loop with index
        for(int i = 0; i< tvSeries.size(); i++){
            System.out.println(tvSeries.get(i));
        }

        System.out.println("----------------------");
//        6. Using listIterator to travserse in both the forward and backward direction
        ListIterator<String> listIterator = tvSeries.listIterator(tvSeries.size());
//        This will print in reverse order
        while(listIterator.hasPrevious()){
            String s = listIterator.previous();
            System.out.println(s);
        }
    }

}
