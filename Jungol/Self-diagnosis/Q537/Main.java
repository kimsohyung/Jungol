package Q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i=1;
		int sum = 0;
		while(a>=i) {
			sum+=i;
			i++;
			}
			
		System.out.println(sum);
	
	
	}
}