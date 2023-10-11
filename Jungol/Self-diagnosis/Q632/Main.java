package Q632;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b = sc.nextInt();
		int c =sc.nextInt();
		
		/*int[]ar = new int[3]
		 * for(int i = 0; i <ar.length; i++){
		 * ar[i]=nextInt():}
		 
		 */
		
		sc.close();
		
		if(a<b&&b<c) {
			System.out.println(a);
		}else if(a<c&&c<b){
			System.out.println(a);
		}else if(b<a&&a<c){
			System.out.println(b);
		}else if(b<c&&c<a){
			System.out.println(b);
		}else if(c<a&&a<b){
			System.out.println(c);
		}else{
			System.out.println(c);
		}
		
		System.out.println("---------------");
		System.out.println("---------------");
		
		
		while(a<b&&b<c) {
			System.out.println(a);
			break;
		}while(a<c&&c<b) {
			System.out.println(a);
			break;
		}while(b<a&&a<c) {
			System.out.println(b);
			break;
		}while(b<c&&c<a) {
			System.out.println(b);
			break;
		}while(c<a&&a<b) {
			System.out.println(c);
			break;
		}while(c<b&&b<a) {
			System.out.println(c);
			break;
		}
		
		
		System.out.println("---------------");
		System.out.println("---------------");
		
		
		int min;
		min = (a < b) ? a : b;
		min = (min < c) ? min : c;
		System.out.println(min);
		
		
		
		
		
		
	}

}
