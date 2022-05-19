package classWork;

import java.util.Scanner;

public class RandomQuestion2 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        char operators = '?';
        int answer = 0;
        int good = 0;
        int bad = 0;
        int score = 0;

        System.out.print("Choose number of questions: ");
        int number = userInput.nextInt();

        int questions = 1;

        while (good != number){
            int randomNumber = (int) (1 + (Math.random() * 10));
            int randomNumberTwo = (int) (1 + (Math.random() * 10));
            int operatorValue = (int) (1 + (Math.random() * 4));

            switch (operatorValue){

                case 1 -> {operators = '+';
                    answer = randomNumber + randomNumberTwo;}

                case 2 -> {operators = '-';
                    answer = randomNumber - randomNumberTwo;}

                case 3 -> {operators = '*';
                    answer = randomNumber * randomNumberTwo;}

                case 4 -> {operators = '/';
                    answer = randomNumber / randomNumberTwo;}
            }

            System.out.printf("%d%c%d = ", randomNumber,operators,randomNumberTwo );
            int userAnswer = userInput.nextInt();
            questions++;

            if (userAnswer == answer){
                good++;}
            else bad++;
        }
        score = good - bad;

        System.out.printf("Correct answers: %d%n", good);
        System.out.printf("Wrong answers: %d%n ", bad);
        System.out.printf("Your score is: %d ", score);









    }
}
