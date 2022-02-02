package com.strings;

public class VaribaleScope {


        static int x = 11;
        static int y = 33;
        public void method1(int x)
        {
            VaribaleScope t = new VaribaleScope();
            this.x = 22;
            y = 44;

            System.out.println("Test.x: " + VaribaleScope.x);
            System.out.println("t.x: " + t.x);
            System.out.println("t.y: " + t.y);
            System.out.println("y: " + y);
        }

        public static void main(String args[])
        {
            VaribaleScope th = new VaribaleScope();
            System.out.println(th.y);
            th.method1(5);
        }


}
