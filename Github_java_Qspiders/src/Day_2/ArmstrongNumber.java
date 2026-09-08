package Day_2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		// num = 153 ---> COUNT = 3
		// 1^3 + 5^3 + 3^3 ----> result = 153
		// num(153) = result(153) ---> Then it's a Armstrong number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int count = 0; // Here Count is used to know, how many digits are present in the number

		while (temp != 0) {
			count++;
			temp /= 10; // ---> Divide it's Used to Remove the Last digit (153 ----> 15)
		}
		temp = num;

		while (temp != 0) {
			int last = temp % 10;
			int res = 1;
			for (int i = 1; i <= count; i++) {
				res *= last;
			}
			sum += res;
			temp /= 10;
		}
		System.out.println((sum == num ? "Amstrong Number" : "Not a Amstrong number"));
	}
}
