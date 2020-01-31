import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class C{
    protected   void show() {
        System.out.println("Inside A");
    }
}

public class Lambda1 extends C {
    @Override
    public void show(){
        System.out.println("Inside LA");
    }

    public static void main(String[] args) {
        Integer arr[]= new Integer[]{7,5,2,10,1};
        int arr1[] = {7,5,2,10,1};
        int arr2[] = new int[7];
        List<Integer> l = Arrays.asList(arr);
        int max=0;



        Collections.sort(l);
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(l);
    }

}
