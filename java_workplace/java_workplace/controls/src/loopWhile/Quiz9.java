package loopWhile;

import java.util.Random;
import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		Random r = new Random();
		String a = ""
				+ "";
		
		int user_win = 0;
		int	user_lose = 0;
		int com_win = 0;
		int com_lose = 0;
		
		while (true) {
			System.out.println("\n==== Up & Down Game ====");
			System.out.println("1.Game Start \n2.Game Score \n3.End Game");
			System.out.print(">> ");
			int select;
			try {
				select = Integer.parseInt(sc.next());
			} catch (Exception e) {
				continue;
			}

			if (select == 3) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			int minNum = 1;
			int maxNum = 100; //구간을 미리 지정
			switch (select) {
			case 1:
				System.out.println("<< Game Start >>");
				int num = (int) (Math.random() * 100 + 1);
				System.out.println("정답 : "+num);

				int count = 0;
				while(true) {
					count++;
					System.out.println("<< Player Turn >>");
					System.out.print("Input Number : ");
					int user;
					int com = 0;
					try {
						user = sc.nextInt();
					} catch (Exception e) {
						sc.nextLine();
						continue;
					}
					
					if(user > num) {
						System.out.println("Down!!");
						minNum=user-1;
						}
					else if(user < num) {
						System.out.println("Up!!");
						maxNum=user+1;
					}
					
					else if(user==num){
						System.out.println("플레이어가 정답을 맞췄습니다!!");
						user_win++;
						com_lose++;
						break;
					}
					System.out.println("사용자가 "+user+"을(를) 불렀기 때문에 컴퓨터의 난수 최소값은"+user+"으로 조정 맞추어야하는 정답 "
							+num+" 컴퓨터가 부를 값"+(user+1)+"~"+num+"사이");
					
					System.out.println("사용자 턴이 끝났습니다 계속하시려면 엔터키를 누르세요");
					a = str.nextLine();
					System.out.println("<<Computer Turn>>");
					
					com = new Random().nextInt((maxNum - minNum) + 1) + minNum; // 난수의 최솟값 최댓값 지정
					System.out.println("InPut Number : "+com);
					if(com < 1 || com > 100)
						continue;
					
					if(com > num) {
						System.out.println("Down!!");
						com=minNum-1;
					}
					else if(com < num) {
						System.out.println("Up!!");
						com=maxNum+1;
					}
					else if(com == maxNum) {
						System.out.println("컴퓨터가 정답을 맞췄습니다!!");
						com_win++;
						user_lose++;
						break;
					}
				}
				break;
				
			case 2:
				System.out.println("당신의  승: " +user_win + " 패: "+user_lose);
				System.out.println("컴퓨터의  승: " +com_win + " 패: "+com_lose);
				break;
			default :
				System.out.println("확인 후 다시 입력하세요.");
			}
		}


	}

}
