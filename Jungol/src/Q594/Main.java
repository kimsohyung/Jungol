package Q594;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] a = new String[50];
		
		for(int i =0; i<50; i++) {
		 a[i] = sc.nextLine();
		 System.out.print(a[i] + a[i]);
		}
		sc.close();
	}

}
//무한 루프중
