package Q9043;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 0;
		int c = 0; 
		int con = 0;
		while(true) {
			int a= sc.nextInt();
			if(a==0) {
				break;
			}
			if(a%2==1) {
				c+=a;
				con++;
			}else {
				
			}
			
		
		}
		
		System.out.println("홀수의 합 = "+c);
			System.out.println("홀수의 평균 = "+(c/con));
	
	}
}
