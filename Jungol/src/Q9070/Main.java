package Q9070;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		
		
		for (int j = 0; j < 10; j++) {
			if (max < a[j]) {
				max = a[j];
			}
		}
		System.out.print(max);
	}

}
