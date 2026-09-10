package Day_5;

import java.util.*;

public class Pattern0101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 0 1 0 1 0
		 * 1 0 1 0 1
		 * 0 1 0 1 0*/
		
		System.out.println("Enter the Row: ");
		int row = sc.nextInt();
		System.out.println("Enter the Column: ");
		int col = sc.nextInt();
		
		int num = 1;

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				System.out.print(num++ % 2 == 1 ? "0 " : "1 ");
			}
			System.out.println();
		}
	}
}