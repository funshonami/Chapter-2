import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int number1 = input.nextInt();

	//Determine if output is EVEN or ODD
	if(number1 % 2== 0) {
		System.out.println("number is Even");
	  }
	if(number1 % 2== 1) {
		System.out.println("number is Odd");
	 }
	}
}
