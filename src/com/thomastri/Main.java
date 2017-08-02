package com.thomastri;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void yell(String words) {

        // requireNonNull is LAZY, which means it will only activate when triggered-
        Objects.requireNonNull(words, () -> "Created issue" + Main.createIssue());
        System.out.printf("%s!!! %n", words.toUpperCase());
    }

    private static String createIssue() {
        System.out.println("Some external API call to a bug tracker");
        return "#ABC!";
    }

    public static void main(String[] args) {
        List<String> ingredients = Arrays.asList(
                "flour",
                "salt",
                "baking powder",
                "butter",
                "eggs",
                "milk"
        );

//        ingredients.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });


        // Arrow (->) represents what happens when it is run
        // No need to specify type for "ingredient" as it knows it will be String
        // ingredients.forEach(ingredient -> System.out.println(ingredient));

        Main.yell("Cupcakes");
        // ingredients.forEach(System.out::println);
        ingredients.forEach(Main::yell);

    }
}
