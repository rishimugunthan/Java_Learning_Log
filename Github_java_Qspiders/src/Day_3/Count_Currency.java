package Day_3;

import java.util.Scanner;

public class Count_Currency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Currency to be calculated in Note... : ");
		int note = sc.nextInt();

		if (note >= 2000) {
			System.out.println("The Note of 2000 is: " + note / 2000);
			note %= 2000;
		}

		if (note >= 500) {
			System.out.println("The Note of 500 is: " + note / 500);
			note %= 500;
		}
		if (note >= 200) {
			System.out.println("The Note of 200 is: " + note / 200);
			note %= 200;
		}
		if (note >= 100) {
			System.out.println("The Note of 100 is: " + note / 100);
			note %= 100;
		}
		if (note >= 50) {
			System.out.println("The Note of 50 is: " + note / 50);
			note %= 50;
		}
		if (note >= 20) {
			System.out.println("The Note of 20 is: " + note / 20);
			note %= 20;
		}
		if (note >= 10) {
			System.out.println("The Note of 10 is: " + note / 10);
			note %= 10;
		}
		if (note >= 5) {
			System.out.println("The Coin of 5 is: " + note / 5);
			note %= 5;
		}
		if (note >= 2) {
			System.out.println("The Coin of 2 is: " + note / 2);
			note %= 2;
		}
		if (note >= 1) {
			System.out.println("The Note of 1 is: " + note / 1);
			note %= 1;
		}

	}
}