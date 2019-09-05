import java.util.Scanner;

public class Add {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int number1 = input.nextInt();	

	System.out.print( "Enter Second number: ");
	int number2 = input.nextInt();

	int sum = number1 + number2;

	System.out.printf("Sum is %d%n", sum);

	int product = number1 * number2;
	System.out.printf("Product is %d%n", product);

	int division = number1 / number2;
	System.out.printf("Division is %d%n", division);

	} 

}