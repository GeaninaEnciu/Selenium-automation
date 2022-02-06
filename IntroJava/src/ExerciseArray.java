public class ExerciseArray {
    public static void main(String[] args) {
        //9. Declare an array of int and initialize it with 5 elements. Calculate the sum of the elements.
        int[] myArray = new int[] {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println(sum);
    }
}