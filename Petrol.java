// import java.util.Scanner;

public class Petrol {
	public static void main(String... args) {
		PetrolPurchase petrol = new PetrolPurchase("Rigasa","Fuel",670, 22, 9);
		
		
	// System.out.printf("The purchase amount is: ");
	//Scanner input = new Scanner(System.in);
	

	//purchaseAmount = netPurchaseAmount - percentageDiscount;
	
	System.out.printf("Station Location is %s, Emmanuel went to buy %s for his Ferari, with litres of %f, at an amount discount of %f", petrol.getStationLocation(), petrol.getPetrolType(), petrol.getPricePerLitre(), petrol.getPurchaseAmount());
	
	
	}
	
}
	
	
	
