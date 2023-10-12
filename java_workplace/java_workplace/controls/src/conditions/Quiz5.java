package conditions;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		int years2;
		
		String data1;
		
		System.out.print("등급을 입력해주세요 :");
		data1 = input1.next() .toUpperCase();
		//char grade = sc.next() .toUpperCase().charAt(0);		
		//Lowercase 소문자만 출력
		if (data1.equals("A") || data1.equals("B")) {
			System.out.println("참잘했어요");
		}  
		else if (data1.equals("C") || data1.equals("D")) {
			System.out.println("분발합시다");
		}  
		else if (data1.equals("F")) {
			System.out.println("-");
		}
		
		System.out.print("연도를 입력해주세요 :");
		years2 = input2.nextInt();
		
		if(years2 % 4 == 0) {
			System.out.print(+years2+" 해당연도는 윤년입니다");
		}
		else if(years2 % 4 == 0 && years2 % 100 == 0) {
			System.out.print(+years2+" 해당연도는 평년입니다");
		}
		else if(years2 % 4 == 0 && years2 % 100 == 0 && years2 % 400 == 0) {
			System.out.print(+years2+" 해당연도는 윤년입니다");
		}

	}

}
