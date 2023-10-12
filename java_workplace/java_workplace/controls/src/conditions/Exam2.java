package conditions;

import java.util.Scanner;


public class Exam2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int data1;
		System.out.println("입력");
		data1 = input.nextInt();
		
		if(data1 < 10) {
			System.out.println("종속문장"); 
		}
		System.out.println("다음문장");

	}

}