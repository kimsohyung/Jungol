package Q614;

import java.util.Scanner;

public class Main {
//맴버변수는 외부에서 못건들게 PRIVATE을씀
	private String school;
	private int grade;

	public void setVar(String school, int grade) {
		this.school = school;
		this.grade = grade;

	}

	public void print() {
		System.out.println(grade + " grade in " + school + " School");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();

		Main s1 = new Main();
		Main s2 = new Main();

		s1.setVar("Jejuelementary", 6);
		s2.setVar(school, grade);

		s1.print();
		s2.print();

	}
}
