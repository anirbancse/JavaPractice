package com.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestScope {

    public void manipulate(int s[]){
        s[0] = 6;
    }

     void show(int s[]){
        for(int q:s)
            System.out.println(q+" ");
    }


    public static void main(String[] args) {

        TestScope testScope = new TestScope();
        int s[] = {1,2,3};
        //int x = Integer.parseInt("5");

//        testScope.manipulate(s);
//        testScope.show(s);

     Stream.of(1,2,4,5,6)
             .map(u->u*2)
             .filter(s1->s1%2==0)
             .forEach(System.out::println);

       Arrays.asList(78,90,190,67).stream()
               .min((o1, o2) -> o1.compareTo(o2))
               .ifPresent(System.out::println);


        int[] A = { 6, 8, 3, 5, 1, 9 };
        Arrays.stream(A).map(p->p*2).forEach(System.out::println);





    }
}
