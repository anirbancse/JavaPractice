package com.streams.api;

import java.util.List;

public class AccumulatorCombiner {

  public static void main(String[] args) {
    //
    var data = List.of(1, 2, 3);
    int f = data.parallelStream().reduce(0, (s1, s2) -> s1 + s2);

    System.out.println(f);
  }
}
