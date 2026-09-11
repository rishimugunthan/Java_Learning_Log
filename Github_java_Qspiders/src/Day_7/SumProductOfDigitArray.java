package Day_7;

public class SumProductOfDigitArray {

	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50 };
		int sum = 0;
		int Product = 1;

		for (int i = 0; i <= array.length - 1; i++) {
			// Sum the each digit in an Array
			sum += array[i];
			// Product the each digit in an Array
			Product *= array[i];
		}
		System.out.println("The Sum Of Digits in Array is: " + sum);
		System.out.println("The Product Of Digits in Array is: " + Product);
	}

}
