public class ExerciseArray4 {
    //11. Declare an array of double and initialize it with 5 elements.
    // Calculate minimum value of the elements.
    public static void main(String[] args) {
        double[] numbers = {9, 20, 4, 5, 6};
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
