import java.util.HashMap;
import java.util.Scanner;


public class HW2 {

    public static HashMap<String, Integer> countWords(String str) {
        HashMap<String, Integer> dictionary = new HashMap<>();
        Integer value;
        for (String word : str.split(" ")) {
            value = dictionary.get(word);
            if (value != null) {
                dictionary.put(word, value + 1);
            } else {
                dictionary.put(word, 1);
            }
        }
        return dictionary;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //String str = "a bb a bbbb a bb bbbb a aa";
        String str = in.nextLine();
        String[] words = str.split(" ");

        HashMap<String, Integer> dictionary;
        dictionary = countWords(str);

        System.out.println(dictionary);
    }
}
