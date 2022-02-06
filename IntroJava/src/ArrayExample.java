public class ArrayExample {
    public static void main(String[] args) {
        // ways to declare and intialize an array
        int[] arr1 =new int[3];
        arr1[0] = 3;
        arr1[1] = 2;
        arr1[2] = 5;

        double[] arr2 = new double[]{0.4, 2.4};

        // how to iterate over an array (iterate means accessing each element of an array)
        int[] myArray = {8, 5, 6, 7, 5, 3};

        // using for loop
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        // using foreach
        for (int element : myArray) {
            System.out.print(element + " ");
        }
    }
}
