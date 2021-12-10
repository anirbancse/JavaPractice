package com.java8;

public class FunctionalInterImpl implements FunctionalInter {

 /*   @Override
    public String showMsg() {
        return "Java 8 ";
    }*/

    @Override
    public void show(String a, String b, int x, int y) {

    }

    public static void main(String[] args) {
        FunctionalInter functionalInter = (a,b,x,y)->{
            System.out.println(a+b+x+y);
        };

        FunctionalInterImpl functionalInter1 = new FunctionalInterImpl();
        System.out.println(functionalInter1.showMsg());

        functionalInter.show("AA","BB",5,6);
    }
}
