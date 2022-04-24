package dorcas;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args){

        Car benzCar = new Car("Benz", "2012", 9_000_000,0.05);
        Car ferrariCar = new Car("ferrari", "1993", 3_000_000, 0.07);

        //System.out.printf("I bought a %s, of %s for $%.2f%n: ", benzCar.getModel(),benzCar.getYear(),benzCar.getPrice());
        //System.out.printf("I bought a %s, of %s for $%.2f: ", ferrariCar.getModel(),ferrariCar.getYear(),ferrariCar.getPrice());

        Scanner userInput =  new Scanner(System.in);

        System.out.println("Enter Car model: ");
        String model = userInput.nextLine();
        benzCar.setModel(model);

        System.out.println("Enter Car year: ");
        String year = userInput.nextLine();
        benzCar.setYear(year);

        System.out.println("Enter Car price: ");
        double price = userInput.nextDouble();
        benzCar.setPrice(price);

        System.out.printf("I bought a %s, of %s for $%.2f at %.2f discount: ", benzCar.getModel(),benzCar.getYear(),benzCar.getPrice(), benzCar.getDiscountPrice());

    }

        }

