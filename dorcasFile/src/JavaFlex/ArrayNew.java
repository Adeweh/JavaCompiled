package JavaFlex;

import java.util.Scanner;

public class ArrayNew {

    public  static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int [] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Enter   " + i +", typed value was" + myIntegers[i]);

        }

    }
    public static int [] getIntegers(int number){
        System.out.println("Enter" + number + "integer values.\r" );
        int [] values = new int [number];

        for (int i = 0; i < values.length; i++) {
            values[i] = userInput.nextInt();

        }
        return values;

    }
}
