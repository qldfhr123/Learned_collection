package loopWhile;

import java.util.Random;
import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int count, win, draw, lose, seed = 10000;
		count = win = draw = lose = 0;
		
		while (true) {
			System.out.println("\n==== Dice Game ====");
			System.out.println("1.Game Start \n2.Game Score \n3.End Game");
			System.out.print(">> ");
			int select;
			try {
				select = Integer.parseInt(sc.next());
			} catch (Exception e) {
				continue;
			}

			if (select == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch (select) {
			case 1:
				System.out.println("게임을 시작합니다.");
				
				while(true) {
					if(seed <= 0 ) {
						System.out.println("배팅 금액을 모두 잃었습니다. 종료합니다.");
						break;
					}
					
					count++;
					
					System.out.println("배팅 금액 : " + seed);
					System.out.println("주사위를 돌리겠습니다.");
					int user = 0;
					for(int i = 1; i <= 3; i++) {
						int tmp = r.nextInt(6) + 1;
						System.out.println(i + "번째 주사위 : " + tmp);
						user += tmp;
					}
					
					System.out.println("당신의 주사위 총 합 : " + user);
					int com = r.nextInt(18 - 3 + 1) + 3;
					
					int bet = 0;
					while(true) {
						try {
							System.out.print("배팅 금액을 정해주세요 : ");
							bet = sc.nextInt();
						} catch (Exception e) {
							sc.nextLine();
							continue;
						}
						
						if(bet > 0 && bet <= seed)
							break;
						System.out.println("배팅 금액은 1 ~ " + seed + "원 까지 가능합니다.");
					}
					
					System.out.println("=== 결과 === ");
					System.out.println("당신의 주사위 : " + user);
					System.out.println("상대의 주사위 : " + com);
					
					if(user > com) {
						System.out.println("이겼습니다.");
						win++;
						seed += bet;
					}else if(user < com) {
						System.out.println("졌습니다.");
						lose++;
						seed -= bet;
					}else {
						System.out.println("비겼습니다.");
						draw++;
					}
					
					char yn;
					while(true) {
						System.out.print("게임을 계속하시겠습니까? (y/n) : ");
						yn = sc.next().toLowerCase().charAt(0);
						if(yn == 'y' || yn == 'n')
							break;
					}
					
					if(yn == 'n')
						break;
				}
				break;
			case 2:
				System.out.printf("%d전 %d승 %d무 %d패 입니다.\n", count, win, draw, lose);
				break;
			default :
				System.out.println("확인 후 다시 입력하세요.");
			}
		}

	}
}



