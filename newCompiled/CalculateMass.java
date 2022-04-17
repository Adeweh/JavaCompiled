import java.util.Scanner;

public class CalculateMass{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double weight = scanner.nextDouble();

		System.out.print("Enter height in inches: ");
		double inches = scanner.nextDouble();
		

		double BMI  = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254) ;

		System.out.printf("BMI is %f", BMI );

	}


}