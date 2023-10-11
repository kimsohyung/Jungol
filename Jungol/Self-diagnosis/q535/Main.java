package q535;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		
		switch((int)num){
		case 4 :
			System.out.println("scholarship");
			break;
		case 3 :
			System.out.println("next semester");
			break;
		case 2 :
			System.out.println("seasonal semester");
			break;
		case 1 :
		case 0 :
			System.out.println("retake");
			break;
			//default
		}
		System.out.println("--------------------------------");
		
		
		double A = sc.nextDouble();
		if(A >= 4.0) {
			System.out.println("scholarship");
		}else if(A >= 3.0) {
			System.out.println("next semester");
		}else if(A >= 2.0) {
			System.out.println("seasonal semester");
		}if(A >= 1.0) {
			System.out.println("retake");
		}
		
		
		
		
	}

}
