import java.util.Scanner;

public class CalculateLargest{
		
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number1;
		int number2;
		int number3;
		int sum;
		int average;
		int product;
		int largest;
		int smallest;

		System.out.print("Enter first integer: ");
		number1 = scanner.nextInt();

		System.out.print("Enter second integer: ");
		number2 = scanner.nextInt();

		System.out.print("Enter third integer: ");
		number3 = scanner.nextInt();

		sum = number1 + number2 + number3;
		average = sum / 3;
		product = number1 * number2 * number3;

		largest = number1;
		if (number2 >= largest) largest = number2;
		if (number3 >= largest) largest = number3;
		
		
		smallest = number1;
		if (number2 <= largest) smallest = number2;
		if (number3 <= largest) smallest = number3;
		

		System.out.printf("Sum is %d\n", sum);
		System.out.printf("Average is %d\n", average);
		System.out.printf("Product is %d\n", product);
		System.out.printf("Largest is %d\n", + largest);
		System.out.printf("Smallest is %d\n", + smallest);
		

	}


}
