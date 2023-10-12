package inputs;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("이름  입력 :");
		String name1 = sc.next();
		String name2 = sc.next();
		
		System.out.println("성 : " +name1);
		System.out.println("이름 : " +name2);
		
		sc.nextLine();//buffer 청소시킴
		System.out.print("주소입력 : ");
		String addr = sc.nextLine(); //단점이 있음 buffer에 마지막 입력값가져온다
		System.out.println("주소 : " +addr);
		
		sc.close();//닫지 않을시 공간을 낭비
	}
	
}
