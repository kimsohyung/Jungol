package Q549;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		int b = 0;
		for (int i = 1; i < a; i++) {
			if (a > sum) {
				sum += i;
				b++;
				i++;
			} else {
				System.out.print((b)+" ");
				System.out.print(sum);
				break;
			}
			
		}

	}

}
