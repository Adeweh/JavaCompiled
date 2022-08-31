package DietelJavaChapters.ChapterFour;

//initialize totalMilesPerGallon
//prompt user to input miles driven
//prompt user to input gallons used
//for each prompt set a sentinel control
//set while condition


import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        double totalMilesPerGallon = 0.0;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter miles driven or -1 to quit: ");
        int miles = userInput.nextInt();


        while (miles != -1) {

            System.out.print("Enter gallons used or -1 to quit: ");
            int gallons = userInput.nextInt();

            double milesPerGallon = (double) miles / gallons;
            System.out.println("Miles driven per gallon is "+milesPerGallon);
            totalMilesPerGallon += milesPerGallon;

            System.out.print("Enter miles driven or -1 to quit: ");
            miles = userInput.nextInt();

        }
        System.out.printf("Combined Miles per gallons obtained for all trips up to this point is: %.3f%n", totalMilesPerGallon);
    }

}

