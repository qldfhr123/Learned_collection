package switchs;

import java.util.Scanner;
import java.util.Random;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		
		int day;
		boolean stop = true;
		
			
		while(stop) {
			System.out.print("2023년 4월 :");
			day = input1.nextInt();
			input1.nextLine();
			
		switch(day % 7) {
		case 0:System.out.println("입력하신 날짜의 요일은 금요일입니다."); break;
		case 1:System.out.println("입력하신 날짜의 요일은 토요일입니다."); break;
		case 2:System.out.println("입력하신 날짜의 요일은 일요일입니다."); break;
		case 3:System.out.println("입력하신 날짜의 요일은 월요일입니다."); break;
		case 4:System.out.println("입력하신 날짜의 요일은 화요일입니다."); break;
		case 5:System.out.println("입력하신 날짜의 요일은 수요일입니다."); break;
		case 6:System.out.println("입력하신 날짜의 요일은 목요일입니다."); break;
		default : System.out.println("프로그램 종료");
				  stop=false;
				  break;
		}
	}
	  
	}

}
