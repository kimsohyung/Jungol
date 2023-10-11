package Q133;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double sum = 0;
		for(int i=0;i<a;i++) {
			int b = sc.nextInt();
			sum+=b;
		}
		System.out.printf("%-10.2f",(sum/a));

	}

}
