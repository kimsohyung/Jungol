package Q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 0;
		int[] a = new int[100];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			b++;
			if (a[i] == 0) {
				break;
			}
		}

		for (int i = b-2; i >= 0; i--) {

			System.out.print(a[i] + " ");
		}

	}
}
