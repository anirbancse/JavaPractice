package com.streams.api;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<Double> doubleSupplier1 = () -> Math.random();
        DoubleSupplier doubleSupplier2 = Math::random;

        System.out.println(doubleSupplier1.get());
        System.out.println(doubleSupplier2.getAsDouble());
    }
}
