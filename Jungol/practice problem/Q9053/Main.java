package Q9053;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < 5; i++) {
			
			for (int k = 0; k < 5; k++) {
				System.out.print(  a[i] + " ");
			}
			System.out.print("\n");
		}

		
		
		for (int i = 0; i < 5; i++) {
			
			for (int k = 0; k < 5; k++) {
				System.out.print(a[k] + " ");
			}
		System.out.print("\n");
		}
	}
}