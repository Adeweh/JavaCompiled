package Arrays;

public class Main {
    public static void main(String[] args) {


//    int [] myArray = new int [10];
//    int [] myArray2 = {1,2,3,4,5,6};
//    String [] stringArray = new String[5];
//    String [] stringArray2 = {"Hello", "World", "How"};
//
//
//    for (int i = 0; i < myArray2.length; i++){
//        myArray2[i] = myArray2[i] * 20;
//        }
//    for (int i = 0; i < myArray2.length; i++){
//        myArray2[i] = myArray2[i] * 20;
//        System.out.println(myArray2[i]);
//
//        int[] numbers = {10, 20, 33, -6, -7};
//        int sum = 0;
//        int average = 0;
//        int largest = numbers[0];
//        int smallest = numbers[0];
//
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//            average = sum / numbers.length;
//            if (largest < numbers[i]) {
//                largest = numbers[i];
//            }
//
//            if (smallest > numbers[i]) {
//                smallest = numbers[i];
//            }
//        }
//
//
//        System.out.printf("sum of array: %d%n ", sum);
//        System.out.printf("average of array: %d%n ", average);
//        System.out.printf("largest is: %d%n ", largest);
//        System.out.printf("smallest is: %d%n ", smallest);

        int [] myArray = {1, 3, 4, 778, 341, 45, -899};
        for (int i=0; i < myArray.length; i++){
            int randomIndex = (int) (Math.random() * 10);
            try {
                System.out.println("array at random index " + randomIndex + " is " + myArray[randomIndex]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(" Invalid index encountered");
            }
        }


    }
}


