import java.util.Scanner;

public class Solution{
		
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int firstNumber = number.nextInt();

		System.out.print("Enter the second number: ");
		int secondNumber = number.nextInt();
		
		int sum = firstNumber + secondNumber;

		int product = firstNumber * secondNumber;

		int difference = firstNumber - secondNumber;

		int quotient = firstNumber / secondNumber;
		
		System.out.printf("The sum is: %d%n", sum);
		System.out.printf("The product is: %d%n", product);
		System.out.printf("The difference is: %d%n", difference);
		System.out.printf("The quotient is: %d%n", quotient);
		

	}





}