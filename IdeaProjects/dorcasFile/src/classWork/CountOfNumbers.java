package classWork;

import java.util.Scanner;

public class CountOfNumbers {
    public static void main(String[] args) {
        int number;
        int countP = 0;
        int countN = 0;
        int countZ = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a set of 10 numbers: \n");
        number = userInput.nextInt();

        for (int i=0; i<10; i++) {

            if (number<0)
                countN++;
            else if (number>0)
                countP++;
            else countZ++;
        }
        System.out.println("Total positive numbers: " +countP);
        System.out.println("Total negative numbers: " +countN);
        System.out.println("Total zero: " +countZ);


    }
}
