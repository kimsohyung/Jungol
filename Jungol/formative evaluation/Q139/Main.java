package Q139;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			if (a > b) {
				for (int k = a; k > b - 1; k--) {
					if (k * i < 10) {
						System.out.print(k + " * " + i + " =  " + (k * i) + "   ");
					} else {
						System.out.print(k + " * " + i + " = " + (k * i) + "   ");
					}
				}
				System.out.println();
			}
			if (a < b) {
				for (int k = a; k < b + 1; k++) {
					if (k * i < 10) {
						System.out.print(k + " * " + i + " =  " + (k * i) + "   ");
					} else {
						System.out.print(k + " * " + i + " = " + (k * i) + "   ");
					}
				}
				System.out.println();
			}

			if (a == b) {
				if (a * i < 10) {
					System.out.println(a + " * " + i + " =  " + (a * i) + "   ");
				} else {
					System.out.println(a + " * " + i + " = " + (a * i) + "   ");
				}

			}

		}

	}

}
