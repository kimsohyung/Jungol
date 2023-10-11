package Q9037;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요. ");
		int a = sc.nextInt();
		if(a>=90) {
			 System.out.print("A");
		}else if(a>=80){
			 System.out.print("B");
		}else if(a>=70) {
			 System.out.print("C");
		}else if(a>=60) {
			 System.out.print("D");
		}else if(a<59) {
			 System.out.print("F");
		
		 }
	}

}


	