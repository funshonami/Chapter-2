import java.util.Scanner;

public class Arithmetic {

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int a = input.nextInt();

	System.out.print("Enter Second number: ");
	int b = input.nextInt();

	System.out.print("Enter third number: ");
	int c = input.nextInt();

	//SUMMATION CALCULATION
	int sum = a + b + c;

	System.out.printf("Sum is %d%n", sum);

	//Average CALCULATION
	int avg = ((a + b + c)/3);

	System.out.printf("Average is %d%n", avg);
	
	//PRODUCT CALCULATION
	int prod = (a * b * c);
	System.out.printf("Product is %d%n", prod);


	//BIGGEST NUMBER CALCULATION
	if(a > b && a > c) {
	System.out.printf("Biggestnumber is %d%n", a);
	
	}

	if(b > a && b > c) {
	System.out.printf("Biggestnumber is %d%n", b);
	
	}


	if(c > a && c > b) {
	
	System.out.printf("Biggestnumber is %d%n", c);
	}
      
   }
}