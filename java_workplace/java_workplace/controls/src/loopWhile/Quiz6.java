package loopWhile;
import java.util.Scanner;
public class Quiz6 {

	public static void main(String[] args) {
		int user=0,com=0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			com = (int)(Math.random()*3)+1;
			
			while(true) {
				try {//플레이어 패 입력
					System.out.println("=====가위 바위 보 게임=====");
					System.out.print("숫자를 선택하세요 (1.가위 / 2.바위 / 3.보 / 0.종료)>> ");
					user=Integer.parseInt(sc.nextLine()); //플레이어 패 입력
					if(user==1 || user==2 || user==3) { //선택지의 입력이 들어오면
						//컴퓨터
						if(com==1) {
							System.out.println("컴퓨터는 가위 를 냈습니다.");
						}
						else if(com==2) {
							System.out.println("컴퓨터는 바위 를 냈습니다.");
						}
						else if(com==3) {
							System.out.println("컴퓨터는 보 를 냈습니다.");
						}

						//유저
						if(user==1) {
							System.out.println("당신은 가위 를 냈습니다.");
						}
						else if(user==2) {
							System.out.println("당신은 바위 를 냈습니다.");
						}
						else if(user==3) {
							System.out.println("당신은 보 를 냈습니다.");
						}

						if((user==1&&com==3) || (user==2&&com==1) || (user==3&&com==2)) {
							System.out.println("YOU Win");
						}
						else if((user==3&&com==1) || (user==1&&com==2) || (user==2&&com==3)) {
							System.out.println("YOU Lose");
						}
						else if(user==com){
							System.out.println("Draw");
						}
						break;
					}
					if(user==0) {
						break;
					}
					else {
						System.out.println("보기의 수를 입력하세요");
						continue;
					}
				}catch(Exception e) {//문자입력시 예외처리
					System.out.println("숫자를 입력해주세요.");
				}
				
			}if(user==0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
	}
		
}
}