import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        //Read an array of int from the keyboard. Calculate the sum of the elements.
        Scanner scan = new Scanner(System.in);
        int n = 0;
        System.out.println("Input no of elements:");
        n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input element" + i + ":");
            arr[i] = scan.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements is" + sum);

        }
    }

