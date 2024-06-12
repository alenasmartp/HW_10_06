package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(
                Arrays.asList(
                        "Max", "Alexandr", "Masha", "Oxana", "Vasilisa", "Dima"
                        System.out.println("names: " + names);
                )
        );


        System.out.println(
                        names
                        .stream()
                        .filter(n -> n.length()) < 7)
                        .mapn n -> n.toUpperCase()
                        .map(n -> n + ":" + n.length())
                        .mapn n -> n.reverse()
                        .toList()
        );

    }
}

