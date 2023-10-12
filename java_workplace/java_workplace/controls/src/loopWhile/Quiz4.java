package loopWhile;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		String id1=null, id2 = null;
		String passwd1=null, passwd2=null;
		int select=0;
		boolean login = true;
		
		while(login) {
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.나가기");
			System.out.print(">>> ");
			select = sc.nextInt();
			
			switch(select) {
			case 1: System.out.print("저장할 아이디 입력:");
					id1 = input1.next();
					System.out.print("저장할 비밀번호 입력:");
					passwd1 = input2.next();
					break;
			case 2: System.out.print("아이디 입력:");
					id2 = input1.next();
					System.out.print("비밀번호 입력:");
					passwd2 = input2.next();
					if(id1.equals(id2)&&passwd1.equals(passwd2)) {
						System.out.println("인증 성공!");
					}
					else {
						System.out.println("인증 실패!!");
					}
					break;
			case 3: System.out.println("프로그램을 종료합니다");
					login=false;
					break;
			default: System.out.println("다시"); 		
			}
			

				
				
			
		}
		
	}

}
