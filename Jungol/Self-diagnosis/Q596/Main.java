package Q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int B = sc.nextInt();
		
		String C = "";
		int G = 0;
		
		if (A.length() - B > 0) {
			G = A.length() - B;

		}

		String D = A.substring(G);
		
		for (int i = A.length() - 1; i >= 0; i--) {
			C = C + A.charAt(i);

		}

		String F = "";
		for (int i = D.length() - 1; i >= 0; i--) {
			F = F + D.charAt(i);
		}

		System.out.println(F);

	}

}
