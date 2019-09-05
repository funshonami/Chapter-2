import java.util.Scanner;
public class Radius {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.printf("Enter Radius: ");
	int radius = input.nextInt();
	System.out.printf("Diameter is:  %d%n", 2 * radius);
	System.out.printf("Circumference is: %f%n", Math.PI * 2 * radius);
	System.out.printf("Area is: %f%n", Math.PI * radius * radius);
	
	}
}