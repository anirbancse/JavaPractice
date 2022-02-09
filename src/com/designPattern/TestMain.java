package com.designPattern;

public class TestMain {
    static void show() {
        System.out.println("TestMain");
    }

    private static void main(String[] args,String s) {

        TestMain.show();
    }

    public static void main(String[] args) {
        main(new String[]{"asd","asdas"},"s");
    }
}
