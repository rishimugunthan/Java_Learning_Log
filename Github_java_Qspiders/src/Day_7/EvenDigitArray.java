package Day_7;

public class EvenDigitArray {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i <= array.length-1; i++) {
			// Using Basic Modulus
//			if(array[i] %2==0) {
//				System.out.println("The Even Digits are : " + array[i]);
//			}
			// using the BitWise Left Shift and Right Shift
			if( (array[i] >> 1 )<< 1 == array[i]) {
				System.out.println(array[i]);
			}
		}
	}
}
