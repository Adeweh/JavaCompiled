package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        double grossSales = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter number of items1 sold: ");
        int item1 = userInput.nextInt();

        System.out.println("Enter number of items2 sold: ");
        int item2 = userInput.nextInt();

        System.out.println("Enter number of items3 sold: ");
        int item3 = userInput.nextInt();

        System.out.println("Enter number of items4 sold: ");
        int item4 = userInput.nextInt();

        grossSales =  (item1 * 239.99) + (item2 * 129.75) + (item3 * 99.95) + (item4 * 350.89);

        double earnings = (200 + (0.09 * grossSales));

        System.out.printf("Sales person's earnings: $%.2f%n", earnings);


    }
}
