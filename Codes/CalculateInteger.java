import java.util.Scanner;

public class CalculateInteger{
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the integer: ");
		int number1 = scanner.nextInt();

		
		int x2 = number1 * number1;
		int sum = number1 + x2;
		int x = 100;


		System.out.printf("%d > x%n", sum);
		System.out.printf("%d == x%n", sum);
		System.out.printf("%d != x%n", sum);
		System.out.printf("%d < x%n", sum);
		

	}


}
