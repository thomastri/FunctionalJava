package com.thomastri;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

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

        Consumer<String> printer = ingredient -> System.out.println(ingredient);

        // Arrow (->) represents what happens when it is run
        // No need to specify type for "ingredient" as it knows it will be String
        // ingredients.forEach(ingredient -> System.out.println(ingredient));

        ingredients.forEach(printer);

    }
}
