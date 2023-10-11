package Q135;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		double sum = 0;
		
		if (a < b||a==b) {
			for (int i = a; i < b + 1; i++) {
				if (i % 3 == 0) {
					sum += i;
					c++;
				} else if (i % 5 == 0) {
					sum += i;
					c++;
				}

			}
			System.out.println("sum : " + (int) sum);
			System.out.printf("avg : %-10.1f", (sum / c));

		}

		if (a > b) {
			for (int i = b; i < a + 1; i++) {
				if (i % 3 == 0) {
					sum += i;
					c++;
				} else if (i % 5 == 0) {
					sum += i;
					c++;
				}

			}
			System.out.println("sum : " + (int) sum);
			System.out.printf("avg : %-10.1f", (sum / c));

		}

	}
}
