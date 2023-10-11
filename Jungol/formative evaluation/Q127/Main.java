package Q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double c = 0.0;
		int con = 0;
		while (true) {
			int a = sc.nextInt();
			if (a > 100 || a <= -1) {
				break;
			} else if (a < 101) {
				c += a;
				con++;
			} 
	
		}
		sc.close();
		System.out.println("sum : " + (int) c);
		System.out.printf("avg : %-10.1f", (c / con));
	}
}
