package Q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double []a = new double [] {0, 85.6 , 79.5 ,83.1, 80.0, 78.2, 75.0};
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		
		System.out.print(a[b]+a[c]);

	}

}
