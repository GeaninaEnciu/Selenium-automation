public class IfExample {
    public static void main(String[] args) {
        // If number is equal to 0 print zero.
        int number = 0;
        if (number == 0) {
            System.out.println("Zero");
        }

        // If n is odd print "Odd" else print "Even".
        int n = 3;
        if (n % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }

        // If value is 0 print "Zero"
        // If value is greater than 0 print "Positive value"
        // If value is smaller than 0 print "Negative value"
        int value = -4;
        if (value == 0) {
            System.out.println("Zero");
        } else if (value > 0) {
            System.out.println("Positive value");
        } else {
            System.out.println("Negative value");
        }

        // If age between 0 and 18 print "minor"
        // If age lower than 65 print "adult"
        // If age greater or equal than 65 print "senior"
        // else print "incorrect value".
        int age = 15;
        if (age >= 0 && age < 18) {
            System.out.println("Minor");
        } else if (age >= 0 && age < 65) {
            System.out.println("Adult");
        } else if (age >= 0) {
            System.out.println("Senior");
        } else {
            System.out.println("Incorrect value");
        }


    }
}