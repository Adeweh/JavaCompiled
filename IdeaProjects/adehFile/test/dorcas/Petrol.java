package dorcas;

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args){

        PetrolPurchase premiumPetrol = new PetrolPurchase("Rigasa", "BlackMarket",10, 200.00, 2.5);

       // System.out.printf("I went to %s, to buy %s of %d at %f per litre. i was given a discount of %f:", premiumPetrol.getStationLocation(), premiumPetrol.getPetrolType(),
               // premiumPetrol.getQuantityPurchase(), premiumPetrol.getPricePerLitre(), premiumPetrol.getPercentageDiscount());
        Scanner userInput =  new Scanner(System.in);

        System.out.println("Enter Station's location: ");
        String location = userInput.nextLine();
        premiumPetrol.setStationLocation(location);

        System.out.println("Enter Petrol Type: ");
        String petrol = userInput.nextLine();
        premiumPetrol.setPetrolType(petrol);

        System.out.println("Enter quantity purchased per litre: ");
        int quantity = userInput.nextInt();
        premiumPetrol.setQuantityPurchase(quantity);

        System.out.println("Enter price per litre: ");
        double price = userInput.nextDouble();
        premiumPetrol.setPricePerLitre(price);

        System.out.println("Enter percentage Discount");
        double discount = userInput.nextDouble();
        premiumPetrol.setPercentageDiscount(discount);

        System.out.printf("I went to %s, to buy %s of %d litres at $%.2f per litre. i was given a discount of %.1f, so i paid $%.2f:", premiumPetrol.getStationLocation(), premiumPetrol.getPetrolType(),
                 premiumPetrol.getQuantityPurchase(), premiumPetrol.getPricePerLitre(), premiumPetrol.getPercentageDiscount(), premiumPetrol.getPurchaseAmount());
    }

}
