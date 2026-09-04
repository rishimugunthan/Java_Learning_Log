package Day_1;

import java.util.Scanner;

public class SumOfPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();

		int sum = 0;
		for (int i = start; i <= end; i++) {

			int j = 2;
			for (; j <= i; j++)

				if (i % j == 0)
					break;

			if (j == i)
				sum += i;
		}
		System.out.println(sum);
	}
}
