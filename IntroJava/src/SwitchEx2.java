import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {

        // 2. Seasons exercise: Read an integer number representing a month (1-12).
        // Using switch statement print the season that the month belongs to (eg: 2, 4, 5 -> Spring, 6, 7, 8 -> Summer etc).
        int month;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input month");
        month = keyboard.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Invalid month");
        }

    }
}