import java.util.*;

interface Sport{
    void calculateAvgAge(int[] age);
    void retirePlayer(int id);
}

class Cricket implements Sport {

    public Cricket() {
        System.out.println("A new cricket team has been formed");
    }

    @Override
    public void calculateAvgAge(int[] age) {

        int sum = 0;
        for (int i = 0; i < age.length; i++) {
            sum = sum + age[i];
        }

        float avgAge = sum / age.length;
        System.out.println("The average age of the team is " + avgAge);
    }

    @Override
    public void retirePlayer(int id) {
       /* for (int i = 0; i < ids.size(); i++) {
            System.out.println("Equal");
            if (ids.get(i) == id) {
                System.out.println("Player with id has already retired");
            }
        }*/
        System.out.println("Player with id: " + id + " has retired");
        //System.out.println("@@@@@@@@@@@@@@@@"+ids.size());
    }
}

class Football implements Sport{

    public Football() {
        System.out.println("A new football team has been formed");
    }

    @Override
    public void calculateAvgAge(int[] age) {
        int sum =0;
        for(int i=0;i<age.length;i++){
            sum = sum+age[i];
        }

        float avgAge = sum/age.length;
        System.out.println("The average age of the team is "+avgAge );
    }

    @Override
    public void retirePlayer(int id) {
        System.out.println("Player with id: " + id + " has retired");

    }

    public void playerTransfer(int id,int amount){
       // System.out.println("Player has already retired");
        System.out.println("Player with id: "+id+" has been transferred with a fee of "+amount);

    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cricket c = new Cricket();
        Football f = new Football();

      /*  int[] age1 = new int[11];
        int[] age2 = new int[11];

        for(int i = 0; i < 2; i++)
        {
            String[] age = sc.nextLine().split(" ");
            if(i == 0){
                int j = 0;
                for(String s : age)
                    age1[j++] = Integer.parseInt(s);
            }
            else{
                int j = 0;
                for(String s : age)
                    age2[j++] = Integer.parseInt(s);
            }
        }*/
       /* c.calculateAvgAge(age1);
        f.calculateAvgAge(age2);
*/
        int arr[] = new int[20];
        for (int j=0;j<6;j++){
            int x = Integer.parseInt(sc.nextLine());
            arr[j] = x;
        }
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                int x = Integer.parseInt(sc.nextLine());
                c.retirePlayer(x);
            } else if (i < 5) {
                int x = Integer.parseInt(sc.nextLine());
                arr[i] = x;
                f.retirePlayer(x);
            } else {
                String[] temp = sc.nextLine().split(" ");
                f.playerTransfer(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
            }
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]+" ");
        }
    }
}