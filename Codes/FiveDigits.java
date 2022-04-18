import java.util.Scanner;

public class FiveDigits{

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.print("Enter a number with five digits: "); 
		number = input.nextInt();
		
		if ((number >= 10000) && (number <= 99999));
		
		
		System.out.printf("%d ", (number / 10000));
		System.out.printf("%d ", (number / 1000) % 10);
		System.out.printf("%d ", (number / 100) % 10);
		System.out.printf("%d ", (number / 100) / 10);
		System.out.printf("%d ", (number / 10));
		
		
		if (number > 99999)
			System.out.println("You had entered a number more than five digits.");
			
		if (number < 99999)
			System.out.println("You had entered a number less than five digits.");	
			
			
			
	}
	
}
		
