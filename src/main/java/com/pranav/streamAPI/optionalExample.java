package com.pranav.streamAPI;

import java.util.Optional;

public class optionalExample {
    public static void main(String[] args) {

        String[] s = new String[10];

        //s[2] = "RAM";

        Optional<String> value = Optional.ofNullable(s[2]);
        //checkNull.ifPresent(System.out::println);

        // check for value is present or not
        if(value.isPresent()){
            String lowercaseString = s[2].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("string value is not present");
    }
}
