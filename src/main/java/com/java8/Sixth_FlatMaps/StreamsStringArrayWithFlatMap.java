package com.java8.Sixth_FlatMaps;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StreamsStringArrayWithFlatMap {

    /*
    * We can't apply any filter operation on the steam if the stream contains a object of
    * a string array, or list of String or Set or any Object. Or if it contains type object.
    * But the object contains some other object.
    * i.e. Stream<String[]>, Stream<List<String>>, Stream<Set<String>>, Stream<List<Object>>.
    * The Stream should always contain type of any Object like String, Integer, etc.
    * i.e. Stream<Object>(), Stream<String>()
    *
    * */

    public static void main(String[] args) {

        String data[][] = {
                {"a", "b"},
                {"c", "d"},
                {"e", "f"}
                    };

//        We can't use directly data.stream() over here since, data is not a part of collections.
//        It is a static array.
//

        Stream<String[]> dataStream = Arrays.stream(data);

//        apply flatmap on datastream
        Stream<String> streamFlatMap = dataStream.flatMap(x -> Arrays.stream(x));
//        Now, on a stream which is of a type Object, the filters can be applied
        Stream<String> dataStreamFilter = streamFlatMap.filter(x -> "a".equals(x.toString()));
        dataStreamFilter.forEach(System.out :: println);

//        Combined actions :

        Stream<String> finalStream = Arrays
                .stream(data)
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> "b".equals(x.toString()));

        finalStream.forEach(x -> System.out.println(x));

    }

}
