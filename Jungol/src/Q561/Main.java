package Q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 1000;
		int max = 0;
		int[] a = new int[10];
		
		
		
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}

		for (int j = 0; j < 10; j++) {
			if (min > a[j] && a[j] > 100) {

				min = a[j];
			}
		}
		if (min == 1000) {
			min = 100;

		}

		
		
		
		
		
		
		
		for (int j = 0; j < 10; j++) {
			if (max < a[j] && a[j] < 100) {
				max = a[j];

			}

		}
		if (max == 0) {
			max = 100;
		}
		System.out.print(max + " ");
		System.out.println(min);
	}

}
