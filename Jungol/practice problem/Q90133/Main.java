package Q90133;

public class Main {

	public static void main(String[] args) {
		System.out.println("전체 7자리로 맞추고 소수 4자리까지 출력 ");
		double x = 01.2340;
		double y = 10.3459;
		System.out.printf("x =  %-10.4f" , x);
		System.out.println(" ");
		System.out.println("y = " + y);
		System.out.println(" ");
		System.out.println("소수 2자리까지 출력(반올림)");
		System.out.printf("x = %-10.2f" , x,"\n");
		System.out.println(" ");
		System.out.printf("y = %-10.2f" ,y);
	}

}
