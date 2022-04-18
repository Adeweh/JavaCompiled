import java.util.Scanner;

public class CalculateSquare{
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		int number1 = scanner.nextInt();

		System.out.print("Enter the second integer: ");
		int number2 = scanner.nextInt();


		int x2 = number1 * number1;
		int y2 = number2 * number2;


		int sum = x2 + y2;

		int difference = x2 - y2;

		
		System.out.printf("The sum is: %d%n", sum);
		System.out.printf("The difference is: %d%n", difference);
	
		

	}





}