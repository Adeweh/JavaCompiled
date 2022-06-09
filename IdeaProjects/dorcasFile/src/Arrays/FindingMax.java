package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindingMax {
    public static void main(String[] args) {

//     int[] myArray = {2, 1, 7, 4, 9, 22, 5, 14, -8, 9};
//        int max = myArray[0];
//        int min = myArray[0];
//        for (int i = 1; i < myArray.length; i++) {
//            if (myArray[i] > max) {
//                max = myArray[i];
//            } else if (myArray[i] < min) {
//                min = myArray[i];
//
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
//    }
//}
        int[] numbers = {-2, 11, 7, 4, -9, 22, 5, 14, -8, 9};

        int sum = 0;
        int average = 0;
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];


            average = sum / numbers.length;
            if (largest < numbers[i]) {
                largest = numbers[i];
            }

            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }


        System.out.printf("sum of array: %d%n ", sum);
       System.out.printf("average of array: %d%n ", average);
      System.out.printf("largest is: %d%n ", largest);
        System.out.printf("smallest is: %d%n ", smallest);
        }
    }





