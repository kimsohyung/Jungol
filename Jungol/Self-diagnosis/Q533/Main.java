package Q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		int b = sc.nextInt();
		
		if(a=='M'&&b<20) {
			System.out.print("BOY");
		}else if(a=='M'&&b>20) {
			System.out.print("MAN");
		}else if(a=='F'&&b<20) {
			System.out.print("GIRL");
		}else if(a=='F'&&b>20) {
			System.out.print("WOMAN");
		}
		
		
		
		
		
		
		
		
		

	}

}
