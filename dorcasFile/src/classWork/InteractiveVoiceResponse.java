package classWork;

import java.util.Scanner;

public class InteractiveVoiceResponse {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);

        System.out.println("To listen in English Press 1: ");
        System.out.println("To listen in Igbo Press 2: ");
        System.out.println("To listen in French Press 3: ");
        System.out.println("To listen in Yoruba press 4: ");
        int number = userInput.nextInt();


        /*if (number == 1) {
            System.out.print("press 1 for Data: ");
            System.out.print("press 2 for Transfer: ");
            number = userInput.nextInt();

            if (number == 1)
                System.out.println("Data");
            else  System.out.println("Transfer");
        }

        if (number == 2) {
            System.out.print("press 1 for Sharing: ");
            System.out.print("press 2 for Caring: ");
            number = userInput.nextInt();
            if (number == 1)
                System.out.println("Sharing");
            else  System.out.println("Caring");

        }
        if (number == 3){
            System.out.print("press 1 for Egg: ");
            System.out.print("press 2 for Champagne: ");
            number = userInput.nextInt();
            if (number == 1)
                System.out.println("Egg");
            else  System.out.println("Champagne");

        }
        if (number == 4) {
            System.out.print("press 1 for Ewa: ");
            System.out.print("press 2 for Agoyin: ");
            number = userInput.nextInt();
            if (number == 1)
                System.out.println("Ewa");
            else  System.out.println("Agoyin");
        }*/

        switch (number) {
            case 1 -> {
                System.out.print("press 1 for Data: ");
                System.out.print("press 2 for Transfer: ");
                int English = userInput.nextInt();
                switch (English) {
                    case 1 -> System.out.println("Data");
                    case 2 -> System.out.println("Transfer");
                    default -> System.out.println("Enter a valid number: ");
                }
            }
            case 2 -> {
                System.out.print("press 1 for Sharing: ");
                System.out.print("press 2 for Caring: ");
                int Igbo = userInput.nextInt();
                switch (Igbo) {
                    case 1 -> System.out.println("Sharing");
                    case 2 -> System.out.println("Caring");
                    default -> System.out.println("Enter a valid number");
                }
            }
            case 3 -> {
                System.out.print("press 1 for Egg: ");
                System.out.print("press 2 for Champagne: ");
                int French = userInput.nextInt();
                switch (French) {
                    case 1 -> System.out.println("Egg");
                    case 2 -> System.out.println("Champagne");
                    default -> System.out.println("Enter a valid number");
                }
            }
            case 4 -> {
                System.out.print("press 1 for Ewa: ");
                System.out.print("press 2 for Agoyin: ");
                int Yoruba = userInput.nextInt();
                switch (Yoruba) {
                    case 1:
                        System.out.println("Ewa");

                    case 2:
                        System.out.println("Agoyin");
                        break;
                    default:
                        System.out.println("Enter a valid number");
                        break;

                }
            }
        }
    }
}











