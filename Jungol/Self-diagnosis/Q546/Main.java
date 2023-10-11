package Q546;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			sum += b;
		}
		System.out.printf("avg : %-10.1f" , (double) sum/a);
		System.out.println(" ");
		if((double)sum/a>80.0) {
			System.out.print("pass");
		}else {
			System.out.print("fail");
		}
		
	}

}
