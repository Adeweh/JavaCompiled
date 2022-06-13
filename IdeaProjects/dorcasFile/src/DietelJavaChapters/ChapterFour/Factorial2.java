package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = userInput.nextInt();

        double e = 1;
        double factorial = 1;
        int i = 1;

        while (i <= terms){
            factorial = factorial * i;
            e = e + (1/factorial);
            i++;
        }
        System.out.println(e);
    }
}
