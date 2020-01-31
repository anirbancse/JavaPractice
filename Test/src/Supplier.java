import java.util.*;

public class Supplier implements Iterable {

    List<Products> lists = new ArrayList<>();
    Set<Products> productsSet = new TreeSet<>();

    public void addList(Products product){
        productsSet.add(product);
    }


    @Override
    public Iterator iterator() {
        System.out.println("insdie ");
        return lists.iterator();
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "lists=" + productsSet +
                '}';
    }
}
