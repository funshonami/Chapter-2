import java.util.Scanner;
public class Last {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 digit number: ");
		int value = input.nextInt();
		int firstNumber = value/10_000;
		value = value % 10000;
		int secondNumber = value/1000;
		value = value % 1000;
		int thirdNumber = value/100;
		value = value % 100;
		int fourthNumber = value/10;
		value = value % 10;
		int fifthNumber = value/1;
		value = value % 1;
		System.out.printf("%d %d %d %d %d", firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
		}
}