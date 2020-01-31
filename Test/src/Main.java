import java.util.HashMap;

public class Main {

    private static final StringBuilder sb = new StringBuilder("abc");

    public static void main(String[] args) {

        //private final StringBuilder sb = new StringBuilder("abc");
        sb.append("gh");

        System.out.println(sb.toString());

        HashMap<String, Integer> wordToNum = new HashMap();

        // Insert key-and-value pairs into the Hashmap
        wordToNum.put("ONE", 1);
        wordToNum.put("TWO", 2);
        wordToNum.put("THREE", 3);
        wordToNum.put("FOUR", 4);
        wordToNum.put("FIVE", 5);


       /* System.out.println(wordToNum.get("THREE"));

        System.out.println(wordToNum.values());
        System.out.println(wordToNum.keySet());

        System.out.println(wordToNum.remove("FOUR"));
        System.out.println(wordToNum.values());
        System.out.println(wordToNum.keySet());
*/


        // Common Use of HashMaps: Which character is the most repeated?
        String s = "aarrka";
        HashMap<Character, Integer> hashMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (hashMap.containsKey(currentChar)) {
                System.out.println("Inside IF");
                // incrememt current value for this key in hashmap by 1
                hashMap.put(currentChar, hashMap.get(currentChar) + 1);
                //System.out.println(currentChar + " " + hashMap.get(currentChar));
            } else {
                System.out.println("Inside ELSE");
                // If we haven't added it to the hashmap, then put it in with the value 1
                hashMap.put(currentChar, 1);
            }
        }

        //calculating the frequency


        Character mostRepeated = ' ';
        Character minRepeated = ' ';
        int max = 0;
        for (Character key : hashMap.keySet()) {
            int currentValue = hashMap.get(key);
            System.out.println("----------------->" + currentValue);
            if (currentValue > max) {
                mostRepeated = key;
                max = currentValue;
            }

        }

        int min = max;
        for (Character key : hashMap.keySet()) {
            int currentValue = hashMap.get(key);
            System.out.println("----------------->" + currentValue);
            if (currentValue < min) {
                minRepeated = key;
                min = currentValue;
            }
        }


            System.out.println("Most Repeated: " + mostRepeated + " | Times: " + max + "--->" + minRepeated);
            System.out.println(hashMap.keySet());
            System.out.println(hashMap.values());
            System.out.println(hashMap.get('o'));
        }
    }

