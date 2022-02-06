import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input n=");
        int n = scan.nextInt();

        // n* limit = 100 --> limit = 100/n
        int limit = 100/n;
        System.out.println("Multiplication table of "+ n + " up to 100:");
        for (int i = 1; i <= limit ; i++) {
            System.out.println(i + " x " + n+" = " + i *n);

        }
    }
}
