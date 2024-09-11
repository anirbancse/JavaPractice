package com;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomCollector {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "B", "C", "D");

        String result = stream.collect(CustomCollectorExample::new,
                CustomCollectorExample::accumulate,
                CustomCollectorExample::combine)
                .getResult();

        System.out.println(result);
    }

    private static class CustomCollectorExample {
        private StringBuilder builder = new StringBuilder();

        public void accumulate(String element) {
            if (builder.length() > 0) {
                builder.append(", ");
            }
            builder.append(element);
        }

        public CustomCollectorExample combine(CustomCollectorExample other) {
            builder.append(", ").append(other.builder);
            return this;
        }

        public String getResult() {
            return builder.toString();
        }
    }
}

