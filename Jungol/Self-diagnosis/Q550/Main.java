package Q550;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int j = a; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int j = 1; j < a+1; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
