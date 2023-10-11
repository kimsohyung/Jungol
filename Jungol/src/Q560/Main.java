package Q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 9999;
		int max = 0;
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}

		for (int j = 0; j < 10; j++) {
			if (min > a[j]&&a[j]%2!=0) {
				min = a[j];
				
			}
		}
		for (int j = 0; j < 10; j++) {
			if (max < a[j]&&a[j]%2==0) {
				max = a[j];
			}
		}
		System.out.print(min + " ");
		System.out.println(max);
	}

}
