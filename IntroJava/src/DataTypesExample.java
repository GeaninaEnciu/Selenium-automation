public class DataTypesExample {
    public static void main(String[] args) {
        // primitive/simple data types
        int v1 = 10;
        System.out.println(v1);
        // by default integer values are considered of type int
        // we need to put L at the end to make Java interpret it as long
        long v2 = 45802079098L;
        System.out.println(v2);
        // by default decimal values are considered of type double
        // we need to put F at the end to make Java interpret it as float
        float v3 = 0.123456789F;
        System.out.println(v3);
        double v4 = 0.123456789123456789;
        System.out.println(v4);
        char v5 = 'a';
        System.out.println(v5);
        // 64 is the code for character @ in Unicode codification
        v5 = 64;
        System.out.println(v5);
        // 9829 is the code for black heart character in Unicode
        v5 = 9829;
        System.out.println(v5);
        boolean v6 = true;
        System.out.println(v6);
    }
}