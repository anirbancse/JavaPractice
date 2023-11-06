package com.javatechie.java8;

import java.util.function.Function;

public class MethodReference {

    Function<String, Integer> parser = Integer::parseInt;

}


