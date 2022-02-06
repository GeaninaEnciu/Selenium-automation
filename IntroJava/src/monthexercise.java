import java.util.Scanner;

public class monthexercise {
    private static int month;

    /*
        1. Months exercise: Read an integer number representing a month (1-12).
        Using switch statement print the name of the month (1 -> January, 2-> February ... 12 -> December).
         */
    public static void main(String[] args) {
        int grade;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert month:");
        month = scan.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Juin");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");

            default:
                System.out.println("You have to insert a month");
        }
    }
}
