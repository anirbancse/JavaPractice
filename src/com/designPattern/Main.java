package com.designPattern;

abstract class A{
 int i=0;
 public A(){
     display();
     i=2;
 }

 abstract void show();
 void display(){
     System.out.println(i);
 }
}

interface Student{
    void show();
}
class Teacher extends A implements Student{

    public Teacher(){
        super();
        i=1;
    }
    @Override
    public void show() {
        new Teacher();
    }
}
class Marks extends Teacher{
    public Marks(){
        i=5;
        show();
    }
}



public class Main {

    public static void main(String[] args) {
        Marks m = new Marks();
        String str= null;

        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("Inner");
        }
        System.out.println(2);


    }
}
