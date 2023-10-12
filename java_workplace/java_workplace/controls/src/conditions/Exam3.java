package conditions;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int data;
		System.out.println("1. easy");
		System.out.println("2. hard");
		System.out.println("3 .end");
		System.out.println(">>>>");

		data = input.nextInt();

		if (data == 1) {
			System.out.println("easy");		
		}
		if (data == 2) {
			System.out.println("hard");
		}
		if (data == 3) {
			System.out.println("end");
		}
	}

}
