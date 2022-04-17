import java.util.Scanner;

public class CalculateWeight{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number in pounds: ");
		double p = input.nextDouble();

		double k = p * 0.454;
		

		System.out.printf("%f  pounds is %f kilogram", p,k);

	}
		

}