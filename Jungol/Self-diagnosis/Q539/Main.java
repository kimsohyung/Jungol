package Q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int c= 1;
		float b=0;
		while(true) {
			int a = sc.nextInt();
			
			if(0<a&a<100) {
				sum=a+sum;
				
				c++;
				
			}else if(a>=100){
				sum=a+sum;
				break;
			}else {
				break;	
			}
			 
		}
		b=(float)sum / c;	
		System.out.println(sum);
		System.out.printf("%.1f\n",b);
	}

}

