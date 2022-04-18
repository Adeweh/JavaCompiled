import java.util.Scanner;

public class CircleRadius{

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		int radius;
		
		System.out.print("Enter the radius of circle: "); 
		radius = input.nextInt();
		
		System.out.printf("Diameter of the circle is %d\n", (2 *radius));
		System.out.printf("Circumference of the circle is %.2f\n", (2 * (Math.PI) * radius));
		System.out.printf("Area of the circle is %.2f\n", ((Math.PI) * (radius * radius)));
		
	}
	
}
		
