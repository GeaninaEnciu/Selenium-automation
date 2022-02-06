import java.util.Scanner;

public class Exercise3 {
    /*4. Declare variable password of type String.
Display message "Input password:" on screen.
Read the password provided by the user (use Scanner class).
If the password is "secret" display message "Welcome to my secret world!" else
display message "Your password has n characters." where n is the number of the characters of the password provided.

     */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String password;
        System.out.println("Input Password");
        password = keyboard.next();
        if (password.equals("secret")) {
            System.out.println("Welcome to my secret world!");
        } else {
            System.out.println("Your password has" + password.length() + " characters.");
        }
    }
}
