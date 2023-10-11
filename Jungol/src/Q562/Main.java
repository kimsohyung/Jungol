package Q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int b = 0;
		double sum = 0;
		int c = 0;
		int sum1 = 0;
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
			if (i % 2 == 0) {
				sum += a[i];
				b++;
			}
			else if (i % 2 == 1) {
				sum1 += a[i];
				c++;
			}
		}
		System.out.println("sum : " + sum1);
		System.out.println("avg : " +  sum / b);

	}

}
