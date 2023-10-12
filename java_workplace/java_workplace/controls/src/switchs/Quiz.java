package switchs;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		String home = null, company = null; 
		int select; boolean stop = true;
		while(stop) { //true 사용시 새로운 매서드를 사용하여 종료 시킬수있음(System.exit(0))
			System.out.println("1.우리집 등록");
			System.out.println("2.회사등록");
			System.out.println("3.등록보기");
			System.out.println("4.종료");
			System.out.print(">>>");
			select = input1.nextInt();
			input1.nextLine();//청소
			
			switch(select) {
			case 1: System.out.println("우리집등록 : ");
					home = input1.nextLine();
					break;
			case 2: System.out.println("회사등록 : ");
					company = input2.nextLine();
					break;
			case 3: System.out.println("우리집 : "+home);
					System.out.println("회사 : "+company);
					break;
			case 4: System.out.println("프로그램 종료");
					stop=false;
					break;	
			default:System.out.println("다시 입력하세여"); 	
			}
		}
	}

}
