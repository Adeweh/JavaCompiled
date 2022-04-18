import java.util.Scanner;

public class PositiveNegative{
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;	
		int number3;	
		int number4;	
		int number5;	
		int totalNegative=0;	
		int totalPositive=0;	
		int totalZeros=0;	
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();	
		
		System.out.print("Enter second integer: ");	
		number2 = input.nextInt();	
		
		System.out.print("Enter third integer: ");
		number3 = input.nextInt();	
		
		System.out.print("Enter fourth integer: ");	
		number4 = input.nextInt();	
		
		System.out.print("Enter fifth integer: ");
		number5 = input.nextInt();	
		
		
		if (number1 < 0)
			totalNegative = totalNegative + 1;	
		
		if (number2 < 0)
			totalNegative = totalNegative + 1;
		
		if (number3 < 0)
			totalNegative = totalNegative + 1;
	
		if (number4 < 0)
			totalNegative = totalNegative + 1;
		
		if (number5 < 0)
			totalNegative = totalNegative + 1;
		
	
		if (number1 > 0)
			totalPositive = totalPositive + 1;
		
		if (number2 > 0)
			totalPositive = totalPositive + 1;
		
		if (number3 > 0)
			totalPositive = totalPositive + 1;
		
		if (number4 > 0)
			totalPositive = totalPositive + 1;
		
		if (number5 > 0)
			totalPositive = totalPositive + 1;
		

		if (number1 == 0)
			totalZeros = totalZeros + 1;
		
		if (number2 == 0)
			totalZeros = totalZeros + 1;
		
		if (number3 == 0)
			totalZeros = totalZeros + 1;
		
		if (number4 == 0)
			totalZeros = totalZeros + 1;
		
		if (number5 == 0)
			totalZeros = totalZeros + 1;
		
	
		System.out.printf("Total negative numbers: %d\n", totalNegative);
		
		System.out.printf("Total postive numbers: %d\n", totalPositive);
		
		System.out.printf("Total zero numbers: %d\n", totalZeros);
		
		
		
	}		
		
		
}		
