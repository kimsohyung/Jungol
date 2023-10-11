package Q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		int b =0;
		while(true) {
			int a = sc.nextInt();
			if(a==0) {
				break;
			}
			if(a%3==0||a%5==0) {
				count++;
			}if(a!=0) {
				b++;
			}
			
		}
		System.out.print(b-count);
	
	}

}
