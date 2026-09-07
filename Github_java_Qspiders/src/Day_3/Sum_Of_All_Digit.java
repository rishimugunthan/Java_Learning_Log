package Day_3;

import java.util.Scanner;

public class Sum_Of_All_Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		int sum = 0;

		while (number > 0) {
			int last = number % 10; // ---> it's Used to Extract the Last Digit...
			number /= 10; // ---> it's used to remove the last Digit....
			sum = sum + last;
		}
		System.out.println("The sum Of Digits are: " + sum);
	}
}
