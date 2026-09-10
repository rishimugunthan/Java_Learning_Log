package Day_6;

public class VarArgs_SumOfDigit {

	static void add(int... num) {
		int sum = 0;
		for(int i : num) {
			sum += i;
		}
		System.out.println("The Sum of all Digit is: " + sum);
	}
	public static void main(String[] args) {
		add(10,20,30,40,50);
	}
}
