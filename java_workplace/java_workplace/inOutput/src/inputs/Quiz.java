package inputs;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? :");
		String name1 = sc.next();

		System.out.print(name1+" 님의 국어점수 :");
		int point1 = sc.nextInt();
		System.out.print(name1+" 님의 영어점수 :");
		int point2 = sc.nextInt();
		System.out.print(name1+" 님의 수학점수 :");
		int point3 = sc.nextInt();
		int sum = point1+point2+point3;
		
		System.out.println("=======================");
		System.out.println("이름 : " +name1);
		System.out.println("=======================");
		System.out.println("국어 : " +point1);
		
		System.out.println("영어 : " +point2);
		
		System.out.println("수학 : " +point3);
		System.out.println("=======================");
		
		System.out.println("합계 : " +sum);
		sc.nextLine();
		System.out.println("=======================");
		
		sc.close();//닫지 않을시 공간을 낭비


	}

}
