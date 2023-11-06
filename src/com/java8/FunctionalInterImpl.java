package com.java8;

public class FunctionalInterImpl implements FunctionalInter {

 /*   @Override
    public String showMsg() {
        return "Java 8 ";
    }*/

    public static void main(String[] args) {
        FunctionalInter functionalInter = (a, b, x, y) -> {
            //System.out.println(a + b + x + y);
            return a + b + x + y;
        };

        FunctionalInterImpl functionalInter1 = new FunctionalInterImpl();
        System.out.println(functionalInter.showMsg());
        System.out.println(FunctionalInter.customMsg("Anirban"));

        var ans = functionalInter.show("AA", "BB", 5, 6);
        System.out.println(ans);
    }

    @Override
    public String show(String a, String b, int x, int y) {
        return "";
    }
}
