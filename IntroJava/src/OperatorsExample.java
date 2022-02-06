public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // arithmetic operators
        System.out.println("Arithmetic operators:");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        // division with integer numbers
        System.out.println(a / b); // calculates the quotient (catul impartii intregi)
        System.out.println(a % b); // calculate the remainder (restul impartirii intregi)
        // division with decimal numbers
        double c = 3.0;
        System.out.println(a / c);

        // compound assignment operators
        int x = 10;
        x += 2; // x = x + 2
        System.out.println(x);
        x -= 1; // x = x - 1;
        System.out.println(x);
        x *= 3; // x = x * 3;
        System.out.println(x);
        x /= 6; // x = x / 6;
        System.out.println(x);
        x %= 2; // x = x % 2;
        System.out.println(x);

        double y = 1;
        y /= 2; // y = y / 2;
        System.out.println(y);

        // increment operators (increment means to add 1)
        int i = 7;
        // pre-increment operator (increase the value with 1 and then use the value)
        System.out.println("Pre-increment operator");
        System.out.println(++i);
        // post-increment operator (use the value and then increase the value with 1)
        System.out.println("Post-increment operator");
        System.out.println(i++);
        System.out.println(i);

        // decrement operators (decrement means to subtract 1)
        int j = 7;
        // pre-decrement operator (decrease the value with 1 and then use the value)
        System.out.println("Pre-decrement operator");
        System.out.println(--j);
        // post-decrement operator (use the value and then decrease the value with 1)
        System.out.println("Post-decrement operator");
        System.out.println(j--);
        System.out.println(j);

        // relational operators
        System.out.println("Relational operators");
        // checking if 2 values are equal
        System.out.println(a == b);
        // checking if 2 values are different
        System.out.println(a != b);

        System.out.println(3 > 4); // false
        System.out.println(3 >= 2); // true
        System.out.println(3 < 4); // true
        System.out.println(3 <= 2); // false

        // logical operators
        System.out.println("Logical operators");

        int n = 4;
        // and operator -> &&
        // checking if n is an even number between 1 and 10
        System.out.println((n % 2 == 0) && (n >= 1) && (n <= 10));

        // or operator -> ||
        // checking if n is an odd number or n is smaller than 5
        System.out.println((n % 2 == 1) || (n < 5));

        // not operator -> !
        // checking if n is not negative
        System.out.println(!(n < 0));
    }
}