public class Exercise8 {
    // 8. Declare an array of String that will contain 5 colors.
    // Display the colors in reverse order.
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue", "yellow", "pink"};
        for (int i = colors.length-1; i>=0; i--) {
            System.out.println(colors[i]);
        }
    }
}
