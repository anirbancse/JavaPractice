import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListItertaion {

    public static void main(String[] args) {
        List<String> lists = Arrays.asList("A","B","C");
        ListIterator<String> listIterator = lists.listIterator();

        while(listIterator.hasNext()){

            String s = listIterator.next();
            lists.remove(s);
           // System.out.println(listIterator.next() + " ");
        }

        System.out.println("backward");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        for(String s: lists){
            if(s.contains("A"))
                lists.remove(s);
        }
    }
}
