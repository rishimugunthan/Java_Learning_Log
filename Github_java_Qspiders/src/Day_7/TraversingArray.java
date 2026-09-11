package Day_7;

import java.util.Arrays;

public class TraversingArray {

	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50 };
		for(int i : array) {
			System.out.println(i);
		}
		System.out.println("------------");
		System.out.println(Arrays.toString(array));
	}
}
