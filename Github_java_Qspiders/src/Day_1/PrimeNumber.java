package Day_1;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num = sc.nextInt();
	int i = 2;
	for( ; i <= num; i++) {
		if(num %i == 0) {
			break;
		}
	}
	System.out.println(i == num ? "It's a PRIME" : "Not a PRIME");
}
}
