import java.util.Comparator;

public class Products implements Comparable<Products> {

    @Override
    public int compareTo(Products o) {
        int id = this.id-o.id;
        System.out.println("Ist:"+id);
        return id;
    }

   // public static final Comparator<Products> BY_ID = Comparator.comparing(Products::getId);
    private String type;
    private int id;

    public Products(String type,int x) {
        this.type = type;
        this.id = x;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Products{" +
                "type='" + type + '\'' +
                ", id=" + id +
                '}';
    }
}
