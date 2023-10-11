package Q9051;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 0;
		int c = 0;
		while(true) {
			int a = sc.nextInt();
			
			if(a%2==0) {
				b++;
			}
			if(c==9) {
				break;
			}
			c++;
			
		}
		System.out.print("입력받은 짝수는 "+b+"개입니다.");

	}

}
