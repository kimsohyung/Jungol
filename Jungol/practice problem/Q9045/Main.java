package Q9045;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while(true) {
			
			
			System.out.println("1. 입력하기");
			System.out.println("2. 출력하기");
			System.out.println("3. 삭제하기");
			System.out.println("4. 끝내기");
			System.out.print("작업할 번호를 선택하세요.");			
			
			
			int a = sc.nextInt();
			
			switch(a) {
			case 1 :
				System.out.println("\n"+"입력하기를 선택하였습니다."+"\n");
				break;
			case 2 :
				System.out.println("\n"+"출력하기를 선택하였습니다."+"\n");
				break;
			case 3 :
				System.out.println("\n"+"삭제하기를 선택하였습니다."+"\n");
				break;
			case 4 :
				System.out.println("\n"+"끝내기를 선택하였습니다."+"\n");
				break;
			default :
				System.out.println("\n"+"잘못 입력하였습니다. "+"\n");
				break;
			}
			
			if(a==4) {
				break;
			}
	
			
		}
	
	
	
	}

}
