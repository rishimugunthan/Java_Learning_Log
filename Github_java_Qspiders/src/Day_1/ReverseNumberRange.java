package Day_1;
import java.util.Scanner;
public class ReverseNumberRange {
	public static void main(String[] args) {
	
		// 10 11 12 13 14 15 -->INPUT
		// 01 11 21 31 41 51 -->OUTPUT
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Starting Number: ");
		int start = sc.nextInt();
		System.out.println("Enter the Ending Number: ");
		int end = sc.nextInt();
		for(int i = start; i <= end; i++) {
			int num = i;
			int rev = 0;
			
			while(num > 0) {
				int last = num % 10;
				rev = rev * 10 + last;
				num /= 10;
			}
			System.out.println(rev);
		}
		
}
}
