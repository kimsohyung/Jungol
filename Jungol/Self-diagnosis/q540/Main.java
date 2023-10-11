package q540;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			int A = sc.nextInt();
			int B = A / 3;
			if (A % 3 == 0) {
				System.out.println(B);
			} else if (A == -1) {
				break;
			} else if (A % 3 != 0) {
			}

		}
		sc.close();
	}

}
