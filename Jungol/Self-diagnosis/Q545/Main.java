package Q545;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int con = 0;
		int con1 = 0;
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			if (a % 3 == 0) {
				con++;
			}
			if (a % 5 == 0) {
				con1++;
				
			}
		
		}
		System.out.println("Multiples of 3 : " + con);
		System.out.println("Multiples of 5 : " + con1);
	}
}
