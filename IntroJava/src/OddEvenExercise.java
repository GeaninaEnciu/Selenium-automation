import java.util.Scanner;

public class OddEvenExercise {
    /*
    Read an integer number from the keyboard and print if it's odd ar even.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int number;
        System.out.println("Input an integer number");
        number = scan.nextInt();
        if (number % 2 == 0 ) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
