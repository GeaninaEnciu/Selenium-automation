public class StringExample {
    public static void main(String[] args) {
        System.out.println("String concatenation");
        // if one operand is a String + does concatenation
        // expressions are evaluated from left to right
        System.out.println("a" + 1 + 2);
        System.out.println(1 + 2 + "a");
        System.out.println("a" + (1 + 2));

        String s1 = "Hello";
        String s2 = "Kitty";
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat(" ").concat(s2).concat("!"));
        System.out.println(s1 + " " + s2 + "!");

        String s3 = new String("text");
        String s4 = new String("text");

        System.out.println("Comparing two strings:");
        System.out.println("using method equals: " + s3.equals(s4));
        System.out.println("not using == : + " + (s3 == s4));

        System.out.println("Usage of some methods of class String:");
        System.out.println("length of a string: " + s1.length());
        System.out.println("toUpperCase: " + s1.toUpperCase());
        System.out.println("toLowerCase: " + s2.toLowerCase());

        System.out.println("index of t: " + s3.indexOf("t"));
        System.out.println("last index of t: " + s3.lastIndexOf("t"));
        System.out.println("replacing all occurrences in a string: " + s3.replaceAll("t","ma"));
        System.out.println("accessing a character from the string using it's position: " + s3.charAt(2));

    }
}











