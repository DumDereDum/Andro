import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hw2 {
    public static boolean ch(int[] check){
        for (int i =0; i<check.length;i++) {
            if (check[i] == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String[] words = {"mother", "bus", "nurse"};
        String[] questions = {"one of the parents",
                              "mean of transportation",
                              "human working in a hospital"};

        int len = words.length;
        Random random = new Random();
        int numOfWord = random.nextInt(len);
        System.out.println(questions[numOfWord]);
        String word = words[numOfWord];
        int[] check = new int[word.length()];

        String ans;
        int index;
        while (true) {
            System.out.print("\nEnter literal: ");
            ans = in.nextLine();
            index = word.indexOf(ans)+1;
            if (index!= -1) {
                for (int i =0; i<word.length(); i++){
                    if(word.charAt(i)==ans.charAt(0)){
                        check[i] = 1;
                    }
                }
                System.out.println("\nThis letter is in the word and it is on the " + (index)+ "th place");
            }
            else {
                System.out.println("\nThis letter not is in the word");
            }

            for (int i = 0; i<check.length;i++) {
                if (check[i] == 1) {
                    char lit = word.charAt(i);
                    System.out.print(lit +" ");
                }
                else {System.out.print(". ");}
            }

            if (ch(check)) {
                System.out.println("\nYou win!");
                break;
            }
        }
    }
}
