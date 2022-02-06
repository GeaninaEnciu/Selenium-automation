import java.util.Scanner;

public class ExampleFor {
    public static void main(String[] args) {
        /*
        Declare variable n of type int.
        Read the value of n from the keyboard.
        Print all the odd numbers smaller than n. (e
         */
        int n;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert a number");
        n = keyboard.nextInt();
        for (int i = 1; i < n; i = i + 2) {
            System.out.println(i);
        }
    }
}