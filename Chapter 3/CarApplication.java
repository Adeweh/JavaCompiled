//import java.util.Scanner;

public class CarApplication {
    public static void main(String... args) {
        Car BMW = new Car("Series", "2020", 15_000_000);
        Car Ferrari = new Car("Enzo", "2021", 90_000_000);

        System.out.printf("Buying a car for %.0f. is no big deal%n",BMW.getPrice());
        System.out.printf("My newest collection goes for %.0f. I can never be broke%n",
                Ferrari.getPrice());

        System.out.println("There was a discount following the festivities");
        BMW.calculateDiscount(5);
        Ferrari.calculateDiscount(7);
        System.out.printf("First car: $%.0f%n", BMW.getPrice());
        System.out.printf("Second car: $%.0f%n", Ferrari.getPrice());
    }
}
