package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class Factorial3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter number of terms: ");
        int terms = userInput.nextInt();

        System.out.println("Enter value for x: ");
        int x = userInput.nextInt();

        double e = 1;
        double factorial = 1;
        int i = 1;

        while (i <= terms){
            factorial = factorial * i;
            double y = Math.pow(x,i);
            e = e + (y/factorial);
            i++;
        }
        System.out.printf("The value of e^%d is %f. ", x,e);
    }
}
