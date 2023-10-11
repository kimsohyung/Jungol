package Q9072;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a=new int[10];
		int b =0;
		int sum =0;
		for(int i =0;i<10;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
			b++;
		}
		System.out.println("총점 = "+sum);
		System.out.println("평균 = "+((double)sum)/b);

	}

}
