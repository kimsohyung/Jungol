package Q9042;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int b = 0;
		double c = 0; 
		while(true) {
			int a= sc.nextInt();
			if(a==0) {
				break;
			}
			cnt++;
			b += a;
			c = (double)b/cnt;
		}
		System.out.println("입력된 자료의 개수 = " + cnt);
		System.out.println("입력된 자료의 합계 = " + b);
		System.out.print("입력된 자료의 평균 = ");
		System.out.printf("%.2f",c);
	
	
	}
}
