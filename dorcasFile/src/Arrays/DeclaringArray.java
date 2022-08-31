package Arrays;

public class DeclaringArray {
    public static void main(String[] args) {
        //     int [] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 10;

            System.out.println(myArray[i]);

        }
        printArray(myArray);

    }

    public static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element" + i + ",value is" + myArray[i]);

//        double[] myDoubleArray = new double[10];
//        myArray[5] = 50;

        }
    }
}