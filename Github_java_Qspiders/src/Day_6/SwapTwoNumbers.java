package Day_6;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		a = a + b; // 10 + 20 = 30
		b = a - b; // 30 - 20 = 10 --> b
		a = a - b; // 30 - 10 = 20 ---> a
		System.out.println(a);
		System.out.println(b);
	}
}
