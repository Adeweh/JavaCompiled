import java.util.Scanner;

public class LargestSmallest{
	public static void main(String[] args) {
		Scanner ace = new Scanner(System.in);
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		int largest;
		int smallest;

		System.out.print("Enter first integer: ");
		number1 = ace.nextInt();

		System.out.print("Enter second integer: ");
		number2 = ace.nextInt();

		System.out.print("Enter third integer: ");
		number3 = ace.nextInt();

		System.out.print("Enter fourth integer: ");
		number4 = ace.nextInt();

		System.out.print("Enter fifth integer: ");
		number5 = ace.nextInt();

		largest = number1;
		
		if (number2 > largest) largest = number2;
		if (number3 > largest) largest = number3;
		if (number4 > largest) largest = number4;
		if (number5 > largest) largest = number5;

		smallest = number1;

		if (number2 < smallest) largest = number2;
		if (number3 < smallest) largest = number3;
		if (number4 < smallest) largest = number4;
		if (number5 < smallest) largest = number5;

		
		System.out.printf("Largest integer is: %d\n", smallest);
		System.out.printf("Smallest integer is: %d\n", smallest);


	}




}