package DietelJavaChapters.ChapterSix;

import java.util.Scanner;

public class TemperatureConversions {
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        mainConverter();

        }

    public static double convertCelsiusToKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        return kelvin;
    }

    public static double convertKelvinToCelsius(double kelvin) {
        double celsius = kelvin - 273.15;
        return celsius;
    }

    public static void mainConverter() {
        System.out.print("Press 1 to convert to Kelvin or 2 to Convert to Celsius: ");
        int press = userInput.nextInt();
        if (press >= 1 && press <= 2) {

            System.out.print("Enter temperature for conversion: ");
            int temp = userInput.nextInt();

            switch (press) {
                case 1 -> System.out.println(convertCelsiusToKelvin(temp));
                case 2 -> System.out.println(convertKelvinToCelsius(temp));
            }

        } else {
            mainConverter();
        }

    }
}
