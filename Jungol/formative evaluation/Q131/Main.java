package Q131;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a<b) {
			for(int i=a;i<b+1;i++) {
				System.out.print(i + " ");
			}
		}else if(b<a){
			for(int k=b;k<a+1;k++) {
				System.out.print(k + " ");
			}
		}else {
			System.out.print(a);
		}

	}

}
