package Q9052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int a = sc.nextInt();
			sum += a;
		}
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : " +(double) sum/5);
	}

}
