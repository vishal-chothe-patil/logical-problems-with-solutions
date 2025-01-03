package com.codingchallenges.solution.tofind;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacterJava8 {

    public static void main(String[] args) {

        String s = "Vishal Chothe";

        // Using Java 8 Stream to find duplicate character
        Optional<Character> duplicate = s.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1)
            .map(Map.Entry::getKey)
            .findFirst();

        duplicate.ifPresent(c -> System.out.println("Duplicate Character: " + c));
    }
}
