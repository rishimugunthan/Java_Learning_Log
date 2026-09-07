package Day_3;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number to Reverse: ");
		int number = sc.nextInt();
		int rev = 0;

		while (number > 0) {
			int last = number % 10;
			rev = rev * 10 + last;
			number /= 10;
		}
		System.out.println("The Reversed Number is: " + rev);
	}

}
