import java.util.Scanner;

public class hw1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers");
        double x = in.nextInt();
        double y = in.nextInt();

        System.out.println("Select the action:");
        System.out.println("\t1) Multiply\n\t2) Division\n\t3) Multiply\n\t4) Division\n");

        int ans = in.nextInt();

        switch (ans) {
            case 1:
                System.out.println(x*y);
                break;
            case 2:
                System.out.println(x/y);
                break;
            case 3:
                System.out.println(x+y);
                break;
            case 4:
                System.out.println(x-y);
                break;
        }

        in.close();
    }
}
