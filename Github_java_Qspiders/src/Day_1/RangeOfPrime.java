package Day_1;

import java.util.Scanner;

public class RangeOfPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();

		for (int i = start; i <= end; i++) {

			int j = 2;
			for (; j <= i; j++)

				if (i % j == 0)
					break;

			if (j == i)
				System.out.println(i);

		}
	}

}