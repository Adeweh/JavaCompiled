package DietelJavaChapters.ChapterTwo;

import java.util.Scanner;

public class DiameterCircumferenceAreaOfCircle {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");
        int radius = userInput.nextInt();

        System.out.printf("The circle's diameter is: %d%n", radius * 2);
        System.out.printf("The circle's circumference is: %f%n", 2 * Math.PI * radius);
        System.out.printf("The circle's area is: %f%n", Math.PI * (radius* radius ));

    }
}
