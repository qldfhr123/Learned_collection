package inputs;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		// 자료형 변수명;
		Scanner sc;
		// sc = 참조 값
		
		/*
		 new : 클래스 실행해준다 클래스는 실행된 상태를 인스턴스(instance)
		 class = 건물의 설계도 instance : 설계도로 만들어진 건물
		 System.in : 운영체제 입력
		 */
		sc = new Scanner (System.in);
		Scanner sc2 = new Scanner (System.in);
		
		System.out.println("문자열");
		sc.next(  );
		
		System.out.println();
		sc.nextInt(12);
	}
}
