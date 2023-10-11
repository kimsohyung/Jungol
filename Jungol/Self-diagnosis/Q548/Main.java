package Q548;

public class Main {

	public static void main(String[] args) {
		for(int i = 2; i < 5; i++){
			for (int k = 1; k < 6; k++) {
				
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
