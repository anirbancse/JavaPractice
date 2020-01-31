public class Array {

    private int arr[];
    private int count;

    public Array(int x) {
        this.arr = new int [x];
    }

    public void insert(int x){
        //System.out.println(arr.length + " "+ count);
        if(arr.length == count){
          //  System.out.println("dynamic");
            int arrNew[] = new int[count*2];
            //System.out.println("###"+arrNew.length);
            for(int i= 0;i<count; i++){
                arrNew[i] = arr[i];
            }
            arr = arrNew;
        }
        arr[count++] = x;
    }

    public void print (){
        for(int i=0;i<count;i++){
            System.out.println(arr[i]);
        }
    }

    public void removeAt(int index){
        if(index < 0 || index >= count)
            System.out.println("Your index is not right");
        for(int i = index;i<count;i++){
            arr[i] = arr[i+1];
        }
        count--;
    }

    public void search(int index){
        if(index < 0 || index >= count)
            System.out.println("Your index is not right");
        //linear search
        for(int i=0;i<count;i++){
            if(arr[index]==arr[i])
                System.out.println("element found : "+arr[i]);
        }
    }
}
