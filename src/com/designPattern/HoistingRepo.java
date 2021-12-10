package com.designPattern;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HoistingRepo {


    public static List<Hoisting> filterHoisting
            (List<Hoisting> hoistingList, Predicate<Hoisting> hoistingPredicate){
        return hoistingList
                .stream()
                .filter(hoistingPredicate)
                .collect(Collectors.toList());
    }
}
