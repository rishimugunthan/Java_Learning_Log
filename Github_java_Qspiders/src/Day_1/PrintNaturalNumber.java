package Day_1;

import java.util.Scanner;

public class PrintNaturalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Starting number: ");
		int start = sc.nextInt();
		System.out.println("Enter the Ending number: ");
		int end = sc.nextInt();

		do
			System.out.println(start++);
		while (start <= end);
	}
}

//ctrl + shift + f --> to alignment the code properly....