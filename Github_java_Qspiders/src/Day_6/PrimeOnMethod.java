package Day_6;

public class PrimeOnMethod {

	static void prime(int number) {
		int i = 2;
		for( ; i <= number; i++) {
			if(number % i == 0) {
				break;
			}
		}
		System.out.println(i == number ? "It's a Prime Number" : "It's Not a Prime Number");
	}
	public static void main(String[] args) {
		prime(7);
	}
}
