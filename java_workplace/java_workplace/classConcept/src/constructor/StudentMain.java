package constructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");		String name = sc.next();
		System.out.print("국어  : ");		int kor =sc.nextInt();
		System.out.print("영어  : ");		int eng = sc.nextInt();
		System.out.print("수학  : ");		int math = sc.nextInt();
		Student student2 = new Student();
		Student student = new Student(name, kor, eng, math);
	
		System.out.println("이름 : " + student.getName());
		System.out.println("국어 : " + student.getKor());
		System.out.println("영어 : " + student.getEng());
		System.out.println("수학 : " + student.getMath());
		System.out.println("---------------------------");
		System.out.println("합계 : " + student.getTotal());
		System.out.println("평균 : " + student.getAverage());
		
		// 기본생성자 호출
		ArrayList<String> list = new ArrayList<>();
		
		HashMap<String, String> map = new HashMap<>();
		map.put("admin", "1234");
		map.put("user1", "1111");
		
		// 생성자 호출
		ArrayList<String> passwords = new ArrayList<>( map.values() );
		System.out.println(passwords);
		
		/*
		 * 기본생성자는 준비가 안되어 있는 케이스
		 * Scanner sc2 = new Scanner();
		 */
				
	}
}












