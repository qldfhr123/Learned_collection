package loopWhile;

import java.util.Random;
import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		int count =0;
		Scanner sc = new Scanner(System.in);
		boolean coin = true;
		while(coin) {
			
			System.out.println("== 동전 앞/뒤 맞추기 ==");
			System.out.print("1. 앞면"); 
			System.out.print(" /2. 뒷면 /"); 
			System.out.println("3. 나가기");
			System.out.print("선택> ");
			int select = sc.nextInt();
		
			count=(int)(Math.random()*2)+1;
			if(select==count) {
				System.out.println("정답");
			}else {
				System.out.println("틀림");
			}
			if(select==3) {
				System.out.println("종료");
				break;
			}
		
	}
	}
}
