package Day_2;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int end = sc.nextInt();
		int i = 1;
		for (; i <= end; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println("FIZZ BUZZ");
			else if (i % 3 == 0)
				System.out.println("FIZZ");
			else if (i % 5 == 0)
				System.out.println("BUZZ");
			else
				System.out.println(i);
		}
	}
}
