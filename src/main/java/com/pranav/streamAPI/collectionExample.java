package com.pranav.streamAPI;

import java.util.*;

public class collectionExample {
    public static void main(String[] args) {


        // list example and methods
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        String element = list.get(1);
        System.out.println(element); // o/p : B
        list.remove(1);
        System.out.println(list);

        for(String item : list)
            System.out.println(item);

        //set example and methods
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("A");
        set.add("C");
        boolean contains = set.contains("A");
        System.out.println(contains); // true
        set.remove("B");
        System.out.println(set);
        for(String item : set)
            System.out.println(item);

        //map example and methods
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        String x = map.get(1);
        System.out.println(x);
        map.remove(4,"D");
        System.out.println(map);







    }
}
