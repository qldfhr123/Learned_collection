package conditions;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int data1;
		System.out.println("수 입력");
		 data1 = input.nextInt(); 
		 
		 if(data1 % 2 == 0) {
			 System.out.println("짝수 입니다");
		 }
		 else{
			 System.out.println("홀수 입니댜");
		 }
		
	}
}
