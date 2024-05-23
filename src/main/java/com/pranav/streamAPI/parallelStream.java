package com.pranav.streamAPI;

import java.util.Arrays;
import java.util.List;

public class parallelStream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //sequential stream
        numbers.stream().forEach(n -> System.out.println(n +" "+ Thread.currentThread().getName()));

        //parallel Stream
        numbers.parallelStream().forEach(n -> System.out.println(n +" "+ Thread.currentThread().getName()));
    }
}
