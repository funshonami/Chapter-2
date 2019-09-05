import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int number1 = input.nextInt();
	
	System.out.print("Enter second number: ");
	int number2 = input.nextInt();
	

	//Determine if output is a Multiple
	if(number1 % number2 == 0) {
		System.out.println("Number 1 & 2 are Multiples");
	  }
	if(number1 % number2 != 0) {
		System.out.println("Number 1 & 2 are NOT Multiples");
	 }
	}
}
