package Q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int count1 = 0;

		while (true) {
			int a = sc.nextInt();

			if (a == 0) {
				break;
			}

			if (a % 2 == 1) {
				// 짝수
				count++;
			} else if (a % 2 == 0) {
				count1++;
			}

		}

		System.out.println("odd : " + count);
		System.out.println("even : " + count1);

	}

}
