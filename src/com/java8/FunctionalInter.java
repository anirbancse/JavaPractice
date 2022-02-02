package com.java8;

@FunctionalInterface
public interface FunctionalInter {
    public void show(String a,String b,int x,int y);

    private static String privateShow(String msg){
        return "Aadsad";
    }
    public static String customMsg(String msg){
        return privateShow(msg);
    }



    public default Integer numberDisplay(){
        return 2;
    }

    public default String showMsg(){
        return "Java";
    }
}
