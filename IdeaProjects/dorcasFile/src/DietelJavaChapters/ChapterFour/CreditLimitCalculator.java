package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        int newBalance;


        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter customer's charge account or -1 to quit:  ");
        int accountNumber = userInput.nextInt();

        System.out.println("Enter balance at the beginning of the month or -1 to quit: ");
        int beginningBalance = userInput.nextInt();

        System.out.println("Enter total of all items charged by the customer this month or -1 to quit: ");
        int totalCharges = userInput.nextInt();

        System.out.println("Enter total of all credits applied to the customer's account this month or -1 to quit: ");
        int totalCredit = userInput.nextInt();

        System.out.println("Enter allowed credit limit or -1 to quit: ");
        int allowedCredit = userInput.nextInt();


        newBalance = beginningBalance + totalCharges - totalCredit;

        System.out.printf("The new balance is: %d%n", newBalance);

        if (newBalance > allowedCredit){

            System.out.println("Credit Limit Exceeded.");



        }







    }
}


