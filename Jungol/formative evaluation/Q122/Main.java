package Q122;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		if(a%400==0||a%4==0&&a%100!=0) {
			System.out.print("leap year");
		}else {
			System.out.print("common year");
		}
	}

}
