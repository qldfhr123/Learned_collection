package loopWhile;

import java.util.Random;
import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int bestScore = 0;
		
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
			
			switch (select) {
			case 1:
				System.out.println("<< Game Start >>");
				
				int com = r.nextInt(100) + 1;
				System.out.println("정답 : " + com);
				
				int count = 0;
				while(true) {
					count++;
					System.out.println("<< Player Turn >>");
					System.out.print("Input Number : ");
					int user = 0;
					try {
						user = sc.nextInt();
					} catch (Exception e) {
						sc.nextLine();
						continue;
					}
					
					if(user < 1 || user > 100)
						continue;
					
					if(user > com)
						System.out.println("Down!!");
					else if(user < com)
						System.out.println("Up!!");
					else {
						System.out.println("플레이어가 정답을 맞췄습니다!!");
						if(bestScore > count || bestScore == 0)
							bestScore = count;
						break;
					}
				}
				break;
				
			case 2:
				System.out.println("최고 기록은 " + bestScore + "번 입니다.");
				break;
			default :
				System.out.println("확인 후 다시 입력하세요.");
			}
		}

	}
}



