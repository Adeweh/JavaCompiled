import java.util.Scanner;

public class CalculateEnergy{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of water in kilograms: ");
		double k = input.nextDouble();

		System.out.print("Enter the initial temperature: ");
		double t1 = input.nextDouble();

		System.out.print("Enter the final temperature: ");
		double t2 = input.nextDouble();

		double Q = k * (t2 - t1) * 4184;

		System.out.printf("The Energy needed is %f", Q);

	}
		

}