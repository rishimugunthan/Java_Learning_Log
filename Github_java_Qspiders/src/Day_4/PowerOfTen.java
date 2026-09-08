package Day_4;

import java.util.Scanner;

public class PowerOfTen {
	public static void main(String[] args) {

		// number --> 1 --> 10
		// number --> 2 --> 100
		// number --> 3 --> 1000
		// number --> 4 --> 10000
		// number --> 5 --> 100000

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		int result = 1;

		for (int i = 1; i <= number; i++) {
			result *= 10;
		}
		System.out.println(result);
		sc.close();
	}
}
