import java.util.Scanner;

public class CalculateSavings{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double monthly_interest_rate = 0.00417;

		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = scanner.nextDouble();

		double total = 100 * (1 + monthly_interest_rate);

		total = (100 + total) * (1 + monthly_interest_rate);
		total = (100 + total) * (1 + monthly_interest_rate);
		total = (100 + total) * (1 + monthly_interest_rate);
		total = (100 + total) * (1 + monthly_interest_rate);
		total = (100 + total) * (1 + monthly_interest_rate);


		System.out.printf("After the sixth month, the account value is %f", total);

	}
		

}