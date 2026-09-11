package Day_7;

public class ReverseEachDigitArray {
	static int reverse(int num) {
		int reverse = 0;
		while (num != 0) {
			// Get the last digit
			int last = num % 10;
			// Add the last digit to reverse
			reverse = reverse * 10 + last;
			// Remove the last digit from num
			num /= 10;
		}
		// Return the reversed number
		return reverse;
	}

	public static void main(String[] args) {
		int array[] = { 11, 53, 23, 93 };
		// Traversing the array
		for (int i = 0; i <= array.length - 1; i++) {
			// Reverse each element and print it
			System.out.println(reverse(array[i]));
		}
	}
}
