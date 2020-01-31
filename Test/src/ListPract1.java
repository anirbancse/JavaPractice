import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPract1 {

    private static Supplier supplier = new Supplier();

    public static void main(String[] args) {



        Products products = new Products("A",3);
        Products products1 = new Products("B",7);
        Products products2 = new Products("C",1);
       // products = products1;

        System.out.println("1 : "+products.hashCode());
        System.out.print("2 : "+products1.hashCode());
        System.out.print("3 : "+products2.hashCode());

        supplier.addList(products);
        supplier.addList(products1);
        supplier.addList(products2);

        System.out.println(supplier.toString());


        System.out.println(products.equals(products1));

        List<Products> productList = new ArrayList<>();

        productList.add(products);
        productList.add(products1);
        productList.add(products2);

        Iterator<Products> itr = productList.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());


        if(productList.equals(supplier)){
            System.out.println("Same...");
        }

//        System.out.println(list);


    }
}
