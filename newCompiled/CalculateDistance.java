import java.util.Scanner;

public class CalculateDistance{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the driving distance: ");
		double distance = scanner.nextDouble();

		System.out.print("Enter miles per gallon: ");
		double miles = scanner.nextDouble();

		System.out.print("Enter price per gallon: ");
		double price = scanner.nextDouble();

		double cost  = distance/ 25.5 * price;

		System.out.printf("The cost of driving is %f", cost);

	}
		

}