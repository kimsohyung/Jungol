package Q598;

import java.util.Scanner;

public class Main {
	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      while(true) {
	         char a = sc.next().charAt(0);
	         int inp = (int)a;
	         
	         if(a >= 'A') {
	            System.out.println(a);   
	         }else if(a >= 48 && a <= 57) {
	            System.out.println(inp);
	         }else{
	            break;
	         }
	      }
	   }
	}