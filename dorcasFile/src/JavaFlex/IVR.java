package JavaFlex;

import java.util.Scanner;

public class IVR {
    public static void main(String[] args) {

        /*String prompt = """
                To listen in English Press 1:
                To listen in Igbo Press 2:
                To listen in French Press 3:
                To listen in Yoruba press 4:
                """;
        System.out.println(prompt);
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
    }

         */

        /*String prompt = """
                1 -> for English
                2 -> for Igbo
                3 -> for French
                4 -> for Yoruba
                """;
        System.out.println(prompt);
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();

         */
        for (int number = 1; number <= 4; number++) {
            System.out.printf("press %d ", number);

            switch (number) {
                case 1 -> System.out.println("English");
                case 2 -> System.out.println("Igbo");
                case 3 -> System.out.println("French");
                case 4 -> System.out.println("Yoruba");
            }
        }
        Scanner userInput = new Scanner(System.in);
        int num = userInput.nextInt();

        if(num == 1){
            System.out.print(num);
            for (num = 1; num <= 2  ; num++) {
                switch (num){
                    case 1 -> System.out.println(" for data");
                    case 2 -> System.out.println("2 for transfer");
                }

            }
            int option = userInput.nextInt();
            if (option == 1){
                System.out.println("data");
            }
            else {
                System.out.println("transfer");
            }

        }


        }

    }

