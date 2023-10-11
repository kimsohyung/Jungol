package Q9054;

public class Main {

	public static void main(String[] args) {
		for(int k = 1; k < 10; k++){
			for (int i = 2; i < 5; i++) {
				
				if(i*k < 10) {
					System.out.print(i + " * " + k + " =  " + i * k +"   ");
				}else {
					System.out.print(i + " * " + k + " = " + i * k + "   ");
				}
			}
			System.out.println();
		}
		
	}

}
