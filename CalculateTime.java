import java.util.Scanner;

public class CalculateTime{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of minutes: ");
		long m = input.nextLong();

		long y = m / (365 * 24 * 60);
		long d = (m % (365 * 24 * 60)) / (24 * 60);

		System.out.printf("%d  minutes is %d years and %d days", m, y, d);

	}
		

}