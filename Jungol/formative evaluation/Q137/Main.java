package Q137;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = 1; i <= a ; i++) {
			for (int k = 1; k <= b ; k++) {
				System.out.print(i*k+" ");
			}System.out.println();
		}
	}

}
