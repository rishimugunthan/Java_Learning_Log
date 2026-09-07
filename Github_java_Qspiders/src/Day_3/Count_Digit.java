package Day_3;

import java.util.Scanner;

public class Count_Digit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Numbers to Count: ");
		int number = sc.nextInt();

		int count = 0;
		while (number > 0) {
			number /= 10;
			count++;
		}
		System.out.println("The digits in the Number is: " + count);
	}
}
