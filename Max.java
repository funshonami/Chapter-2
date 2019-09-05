import java.util.Scanner;

public class Max {

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int a = input.nextInt();

	System.out.print("Enter Second number: ");
	int b = input.nextInt();

	System.out.print("Enter third number: ");
	int c = input.nextInt();


	int biggestnumber=0;
	if(a > b) {
	biggestnumber = a;
	
	}

	if(b > a) {
	biggestnumber = b;
	}

	if(biggestnumber > c) {
	biggestnumber = biggestnumber;

	}


	if(c > biggestnumber) {
	biggestnumber = c;
	}
	System.out.printf("Biggestnumber is %d%n", biggestnumber);
	
      
   }
}