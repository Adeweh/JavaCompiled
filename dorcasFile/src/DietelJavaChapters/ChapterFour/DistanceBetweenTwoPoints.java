package DietelJavaChapters.ChapterFour;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter x coordinate for point1: ");
        int x1 = userInput.nextInt();

        System.out.print("Enter y coordinate for point1: ");
        int y1 = userInput.nextInt();

        System.out.print("Enter x coordinate for point2: ");
        int x2 = userInput.nextInt();

        System.out.print("Enter y coordinate for point2: ");
        int y2 = userInput.nextInt();

        double distance =Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("The distance between two points: " + distance);
    }
}
