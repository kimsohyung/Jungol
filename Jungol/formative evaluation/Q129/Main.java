package Q129;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.print("Base = ");
			int a = sc.nextInt();
			
			System.out.print("Height = ");
			double b = sc.nextDouble();
			
			System.out.println("Triangle width = "+(double)(a*b/2));
			
			System.out.print("Continue? ");
			char c = sc.next().charAt(0);
			
			if(c!='Y' && c!='y') {
				break;
			}
		}
	}

}
