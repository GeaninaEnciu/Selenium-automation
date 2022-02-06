import java.util.Scanner;

public class Example5 {
    //6. Declare variable n of type n. Read the value of n from the keyboard.
    // Print all the odd numbers smaller than n.
    public static void main(String[] args) {
        int n;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert a number");
        n = keyboard.nextInt();
        for (int i = 1; i < n; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}

