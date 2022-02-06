import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int noToGuess;
        int value;
        Scanner keyboard = new Scanner(System.in);

        //generating a random number
        Random rand = new Random();
        // rand.nextInt (100) generates a number between o and 99
        noToGuess = rand.nextInt(100) + 1;

        do {
            System.out.println("Guess the number (1 to 100):");
            value = keyboard.nextInt();
            if (value == noToGuess) {
                System.out.println("Congratulations! You guessed!");
            } else if (value < noToGuess) {
                System.out.println("Too low! Try again!");
            } else {
                System.out.println("Too big! Try again!");
            }
        } while (value != noToGuess);
    }
}
