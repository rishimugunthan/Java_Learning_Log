package Day_4;
import java.util.Scanner;

public class Xylem_and_Phoem {
	public static void main(String[] args) {

		// 3 4 1 7 ----> 3 x 7 = 21;
		// ----> 4 x 1 = 4; (21 != 4) -----> Phoem

		// 1 2 2 4 ----> 1 x 4 = 4;
		// ----> 2 x 2 = 4; (4 == 4) -----> Xylem

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();

		int last = number % 10;
		number /= 10;

		int sum = 0;

		while (number >= 10) {
			sum += (number % 10);
			number /= 10;
		}
		System.out.println(number * last == sum ? "Xylem" : "Phoem");
		sc.close();
	}
}
