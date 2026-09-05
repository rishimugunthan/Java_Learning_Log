
package Day_2;

import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Starting number: ");
		int start = sc.nextInt();
		System.out.println("Enter the Ending number: ");
		int end = sc.nextInt();
		
		int sum = 0;
		int prod = 1;
		
		for(int i = start; i <= end; i++) {
			if(i %2 == 0) {
				sum += i;
			} else {
				prod *= i;
			}
		}
		System.out.println("The Sum of Even number is: " + sum);
		System.out.println("The Product of Odd number is: " + prod);
	}
}
