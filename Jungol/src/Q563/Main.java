package Q563;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] arr= new int[10];
		Integer[] arr2 = new Integer[arr.length];
		for(int i =0; i<10;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i = 0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}

		Arrays.sort(arr2, Collections.reverseOrder());

		for(int i = 0; i < arr2.length; i++)
		{
			System.out.print( arr2[i] + " ");
		}
			
		
	}
}