public class ExerciseArray3 {
    // 10. Declare an array of int and initialize it with 5 elements.
    // Calculate maximum value of the elements.
    public static void main(String[] args) {
        int[] numbers = {2, 94, 16, 8, 19};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
