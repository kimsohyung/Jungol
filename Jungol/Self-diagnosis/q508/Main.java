package q508;

public class Main {

	public static void main(String[] args) {
		String a = "item";
		String b = "count";
		String c = "price";
		String d = "pen";
		String e = "20";
		String f = "100";
		String g = "note";
		String h = "5";
		String i = "95";
		String j = "eraser";
		String k = "110";
		String l = "97";
		System.out.printf("%10s%10s%10s\n", a, b, c);
		System.out.printf("%10s%10s%10s\n", d, e, f);
		System.out.printf("%10s%10s%10s\n", g, h, i);
		System.out.printf("%10s%10s%10s\n", j, k, l);

		System.out.println("---------------------------------");

		String[] ar = { "item", "count", "price", "pen", "20", "100", "note", "5", "95", "eraert", "110", "97" };
		for (int z = 0; z < ar.length; z++) {
			if(z%3==0 && z!=0) {
				System.out.print("\n");
			}
			System.out.printf("%10s", ar[z]);
			
		}

	}

}
