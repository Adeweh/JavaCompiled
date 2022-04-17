import java.util.Scanner;

public class FutureValue{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter investment amount: ");
		double investmentAmount = scanner.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterest = scanner.nextDouble();
		
		System.out.print("Enter number of years: ");
		int years = scanner.nextInt();
		
		double monthlyInterest = (annualInterest)/1200;

		double futureInvestmentValue  = investmentAmount * Math.pow(1 + monthlyInterest, years * 12);

		System.out.printf("Accumulated value is %f", futureInvestmentValue);

	}
		

}