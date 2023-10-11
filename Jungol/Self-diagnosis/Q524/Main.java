package Q524;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		/*if(a==0) {
			System.out.print("0 ");
		}else {
			System.out.print("1 ");
		}
		if(b==0) {
			System.out.print("0 ");
		}else {
			System.out.print("1 ");
		}*/

		boolean c=(a!=0);
		boolean d=(b!=0);
		
		System.out.println((c&&d)+ " " + (c||d));
		
		
	}

}
