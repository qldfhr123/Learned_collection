package arrays;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int day=0,month=0;
		int dayTotal = 0;
		int  [] lastday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] week = {"토", "일", "월", "화", "수", "목", "금"};
		while (true) {
			System.out.print("월 일 입력 : ");
			month=sc.nextInt();
			day=sc.nextInt();
			
			if(1>month || month>12) {
				sc.nextLine();
				continue;
			}
			if (day < 1 || day > lastday[month - 1]) {//0~11까지
				sc.nextLine();
				continue;
			}
			for(int i = 0; i < month - 1; i++) { //i가 0부터 month - 1까지 1씩 증가할때마다
				dayTotal += lastday[i];
				}break;
			
		 }
		dayTotal = day + dayTotal;
		int today = dayTotal % 7; //1주는 7일 이므로 7로 나누어 나머지가 0~6
		System.out.println( "2023년 "+ month + "월 " + day +"일 은 "+week[today] + "요일 입니다."); 
		//요일도 배열에 들어가있으니까 그만큼 반복돌리는것
	}
}
