package switchs;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		String name = null; int select; boolean stop = true;
		while(stop) { //true 사용시 새로운 매서드를 사용하여 종료 시킬수있음(System.exit(0))
			System.out.println("1. 이름 입력");
			System.out.println("2. 이름 출력");
			System.out.println("3. 종료");
			System.out.print(">>>");
			select = input1.nextInt();
			switch(select) {
			case 1: System.out.println("이름입력");
					name = input1.next();
					break;
			case 2: System.out.println("이름"+name);
					break;
			case 3: System.out.println("프로그램 종료");
					stop=false;
					break;
			default: System.out.println("다시"); 		
			}
		}
	}

}
