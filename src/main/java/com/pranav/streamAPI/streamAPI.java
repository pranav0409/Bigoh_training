package com.pranav.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class streamAPI {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "apple", "banana");

        // Example of filter, map, sorted, distinct, limit, skip
        List<String> processedWords = words.stream()
                .filter(word -> word.length() > 4)        // Filter words with length > 4
                .map(String::toUpperCase)                // Convert each word to uppercase
                .distinct()                             // Remove duplicates
                .sorted()                               // Sort alphabetically
                .limit(5)                               // Limit to the first 5 elements
                .skip(1)                                // Skip the first element
                .collect(Collectors.toList());          // Collect results into a list

        processedWords.forEach(System.out::println);
        // Output:
        // BANANA
        // CHERRY
        // ELDERBERRY
        // GRAPE
        //-----------------------------------------------------------------------------------------------
        //Terminal operations

        // Example of forEach
        System.out.println("\nOriginal words:");
        words.stream().forEach(System.out::println);
        // Output: apple, banana, cherry, date, elderberry, fig, grape, apple, banana

        // Example of collect to a Set to show the distinct elements
        Set<String> wordSet = words.stream()
                .collect(Collectors.toSet());
        System.out.println("\nDistinct words:");
        wordSet.forEach(System.out::println);
        // Output: apple, banana, cherry, date, elderberry, fig, grape (order may vary)

        // Example of reduce
        Optional<String> concatenated = words.stream()
                .reduce((word1, word2) -> word1 + ", " + word2);
        concatenated.ifPresent(System.out::println);
        // Output: apple, banana, cherry, date, elderberry, fig, grape, apple, banana

        // Example of count
        long count = words.stream()
                .filter(word -> word.length() > 5)
                .count();
        System.out.println("\nCount of words with length > 5: " + count);
        // Output: Count of words with length > 5: 3

        // Example of findFirst
        Optional<String> firstWord = words.stream()
                .findFirst();
        firstWord.ifPresent(word -> System.out.println("\nFirst word: " + word));
        // Output: First word: apple

        // Example of allMatch
        boolean allLongerThanThree = words.stream()
                .allMatch(word -> word.length() > 3);
        System.out.println("\nAll words longer than 3 characters: " + allLongerThanThree);
        // Output: All words longer than 3 characters: true

        // Example of noneMatch
        boolean noneLongerThanTen = words.stream()
                .noneMatch(word -> word.length() > 10);
        System.out.println("No words longer than 10 characters: " + noneLongerThanTen);
        // Output: No words longer than 10 characters: false
    }
}

