package Q105;

public class Main {

	public static void main(String[] args) {
		String[] A = { "Seoul", "10,312,545", "+91,375", 
				"Pusan", "3,567,910", "+5,868", 
				"Incheon", "2,758,296","+64,888",
				"Daegu", "2,511,676", "+17,230",
				"Gwangju", "1,454,636", "+29,774" };

		for (int i = 0; i < 15; i++) {
			System.out.printf("%15s", A[i]);
			if (i == 2 || i == 5 || i == 8 || i == 11) {
				System.out.print("\n");

			}
		}

	}

}
