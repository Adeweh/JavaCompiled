package dorcas;

import java.util.Scanner;

public class Score {

        public static void main(String[] args) {

            Scanner userInput = new Scanner(System.in);

            // enter a score
            System.out.print("Enter a number: ");
            int number = userInput.nextInt();

            // score >= 55 print Pass
            if (number >= 55) {
                System.out.print("Pass");
            }
            //score < 55 print fail
            if (number < 55) {
                System.out.print("Fail");
            }
        }



    }



//

// pseudocode

//if statement

