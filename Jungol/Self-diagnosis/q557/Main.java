package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] A = new String[10];
		
		for(int i =0; i< A.length;i++) {
			A[i] = sc.next();
			if(i%3==0 && i!=9) {
				System.out.print(A[i]+" ");
			}
		}
		sc.close();
	}

}
