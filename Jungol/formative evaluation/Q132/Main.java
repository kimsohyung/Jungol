package Q132;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for(int i =1;i<a+1;i++) {
			if(i%5==0) {
				sum+=i;
			}
		}
		System.out.print(sum);

	}

}
