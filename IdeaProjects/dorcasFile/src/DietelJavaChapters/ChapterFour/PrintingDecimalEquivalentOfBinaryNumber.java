package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class PrintingDecimalEquivalentOfBinaryNumber {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a binary integer: ");
        long binary = userInput.nextInt();

        long number = binary;
        double decimalEquivalent = 0;
        int counter = 0;

        while (binary > 0){
            long remainder = binary % 10;
            decimalEquivalent += (remainder * Math.pow(2, counter));
            counter++;
            binary = (binary - remainder)/10;
        }
        System.out.printf("%d in the binary is equivalent to %.0f in deci,al.", binary, decimalEquivalent);
    }
}
