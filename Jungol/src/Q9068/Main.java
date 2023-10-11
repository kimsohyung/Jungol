package Q9068;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[100];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] == 0) {
				break;
			}
		}

		for (int i = 1; i < a.length; i++) {
			if (a[i] == 0) {
				break;
			}
			System.out.print(a[i] + " ");
			i++;
		}

	}
}
