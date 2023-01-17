package com.strings;

public class Prog8 {

    static String reverseString(String s){
        String revStr = "";
        for(int i=s.length()-1;i>=0;i--){
            revStr = revStr.concat(String.valueOf(s.charAt(i)));
        }
        return revStr;
    }

    public static void main(String[] args) {
        String s = "abc def ghi";
        StringBuilder sb = new StringBuilder();
        String newStr="";

        String str[] = s.split(" ");
        for(String sh:str){
            newStr = newStr.concat(reverseString(sh)+" ");
        }
        System.out.println(newStr);
    }
}
