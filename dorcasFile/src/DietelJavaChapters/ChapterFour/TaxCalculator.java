package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        double taxRate = 0.15;
        double excessCeiling = 0.20;
        int counter = 1;

        double totalTax = 0;

        Scanner userInput = new Scanner(System.in);

        while ( counter <= 3){
            System.out.println(" How much do you earn?:\n ");
            double earnings = userInput.nextDouble();

            if (earnings <= 30_000) {
                totalTax = taxRate * earnings;

            } else if (earnings > 30_000) {
                totalTax = excessCeiling * earnings;
            }
            counter++;

        System.out.printf("Total tax for earnings is: %.2f:\n", totalTax);

        }

    }

}


