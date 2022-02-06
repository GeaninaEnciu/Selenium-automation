import java.util.Scanner;

public class SwitchExample {
/*
    Declare a variable of int type called grade.
    Grade can have values between 1 and 10.
    If the grade is:
    10 type "You are a genius!"
    9, 8 type "You did great!"
    7, 6, 5 type "You passed."
    4, 3, 2, 1 type "You need to study more."
    If the grade has none of the above values type "Invalid grade!".
 */

    public static void main(String[] args) {
        int grade;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input grade:");
        grade = scan.nextInt();
        switch (grade) {
            case 10:
                System.out.println("You are a genius!");
                break;
            case 9:
            case 8:
                System.out.println("You did great!");
                break;
            case 7:
            case 6:
            case 5:
                System.out.println("You passed.");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println("You need to study more.");
                break;
            default:
                System.out.println("Invalid grade!");
        }
    }
}