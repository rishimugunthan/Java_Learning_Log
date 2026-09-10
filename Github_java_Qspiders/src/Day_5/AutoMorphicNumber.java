package Day_5;

import java.util.Scanner;

public class AutoMorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		
		int square = number * number;
		int count = 0;
		int temp = number;

		while (temp > 0) {
			temp /= 10;
			count++;
		}

		int power = 1;

		for (int i = 1; i <= count; i++) {
			power *= 10;
		}

		int lastDigit = square % power;

		System.out.println(number == lastDigit ? "AutoMorphic Number" : "Not a AutoMorphic Number");
	}
}
