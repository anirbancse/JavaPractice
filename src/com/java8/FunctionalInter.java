package com.java8;

@FunctionalInterface
public interface FunctionalInter {
    public void show(String a,String b,int x,int y);

    public static String customMsg(String msg){
        return msg;
    }

    public default Integer numberDisplay(){
        return 2;
    }

    public default String showMsg(){
        return "Java";
    }
}
