package com.callback;

import java.util.function.Consumer;
import java.util.function.Function;

public class Prog1 {

    public static void deductTax(double gross, Consumer<Double> callback){
        System.out.println("decduct tax!!");
        double tax = 5;
        double afterTax = gross * (100 - tax) / 100;
        callback.accept(afterTax);
    }

    public static void getSalary(Consumer<Double> callback) {
        double salary = 50_000.00;
        System.out.println("Get salary...");
        // call back our callback function
        callback.accept(salary);
    }


    public static void main(String... args) {
        // here we are passing a consumer function
        // as an argument
        getSalary((salary) -> {
            System.out.println("Gross salary :" + salary);
            deductTax(salary,(afterTaxSalary)->{
                System.out.println(afterTaxSalary);
            });
        });
    }
}
