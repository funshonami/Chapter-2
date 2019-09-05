import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first numner: ");
	int number1 = input.nextInt();

	System.out.print("Enter second number: ");
	int number2 = input.nextInt();
	if(number1 > number2) {
		System.out.println("number1 is larger");
	}
	if(number1 < number2) {
		System.out.println("number1 is lesser");

	}
}

}