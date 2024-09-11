package com.java8;

public class FunctionalInterImpl implements FunctionalInter {

 /*   @Override
    public String showMsg() {
        return "Java 8 ";
    }*/

    static String showimpl(String a,String b,int x,int y){
        return a + b + x + y;
    }

    public static void main(String[] args) {
        FunctionalInter functionalInter = FunctionalInterImpl::showimpl;

        FunctionalInterImpl functionalInter1 = new FunctionalInterImpl();
        System.out.println(functionalInter.showMsg());
        System.out.println(FunctionalInter.customMsg("Anirban"));


        //System.out.println(FunctionalInter::showMsg);

        var ans = functionalInter.show("AA", "BB", 5, 6);
        System.out.println(ans);
    }

    @Override
    public String show(String a, String b, int x, int y) {
        return "";
    }
}
