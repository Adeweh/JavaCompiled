import java.util.Scanner;

public class CalculateHeight{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a value for feet: ");
		double f = input.nextDouble();

		double m = f * 0.305;
		

		System.out.printf("%f feet is %f meters", f,m);

	}
		

}