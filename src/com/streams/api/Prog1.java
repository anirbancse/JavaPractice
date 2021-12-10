package com.streams.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Prog1 {

    public static void main(String[] args) {

        List<String> lists =  Arrays.asList("Sydney", "Dhaka", "New York", "London");
        lists.stream().forEach(System.out::println);
        Stream.of(lists).map(s->s.stream().filter(st->st.startsWith("S"))).forEach(System.out::println);
        //lists.stream().filter(s->s.startsWith("S")).forEach(System.out::println);

        Function<Integer,Integer> functionApp = s->s*5;

        //System.out.println(functionApp.apply(5));

/*        Consumer<List<String>> upperCaseConsumer = list -> {
            for(int i=0; i< list.size(); i++){
                list.set(i, list.get(i).toUpperCase());
            }
        };

        Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);


        upperCaseConsumer.andThen(printConsumer).accept(lists);*/

       //lists.stream().map(s->s.toUpperCase()).forEach(System.out::println);

        List number = Arrays.asList(2,3,4,5);



    }
}
