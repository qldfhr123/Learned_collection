package loopWhile;
import java.util.Scanner;
import java.util.Random;
public class r_quiz9 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int userWin = 0; // 사용자 승점
		int userLose = 0; // 사용자 패점
		int comWin = 0; // 컴퓨터 승점
		int comLose = 0; // 컴퓨터 패점
		int userInput = 0;
		int menuSel = 0;
		
		while (true) {
			System.out.println("== Up & Down Game ==");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. Game Exit");
			System.out.print("> ");
			try {
				menuSel = Integer.parseInt(input.next()); // 메뉴 선택변수
			} catch (Exception e) {
				System.out.println("다시 입력하세요.");
				continue;
			}

			int comMax = 100; // 상대 컴퓨터가 난수를 만들 때 사용하는 최대값
			int comMin = 1; // 상대 컴퓨터가 난수를 만들 때 사용하는 최소값
			// 향후 사용자와 컴퓨터의 UP, Down 정보를 바탕으로 변한다.

			switch (menuSel) {
			case 1:
				System.out.println("<< Game Start >>");
				int target = (int) (Math.random() * 100 + 1); // target : 맞추어야 하는 정답을 생성하고.
				System.out.println("정답 : " + target);
				while (true) { // 정답을 맞출 때까지 반복되는 게임 반복문

					/* =========== 사용자 턴 시작 ============= */
					System.out.println("<< Player Turn >>");
					try {
						System.out.print("Input Number : ");
						userInput = Integer.parseInt(input.next()); // 정답을 맞추려는 플레이어 입력
					} catch (Exception e) {
						System.out.println("다시 입력하세요.");
						continue;
					}

					if (userInput > target) { // 플레이어의 시도에 따른 결과 출력
						System.out.println("Down!!");
						comMax = userInput - 1;
						/*
						 * 플레이어가 부른 값이 정답보다 큰 경우, 1 작은 값으로 설정한다. ex)답이 50일 때 사용자가 55를 불렀다면, 컴퓨터는 부를 수 있는
						 * 최대 값을 54로 세팅한다.
						 */
						System.out.println("사용자가 " + userInput + "을(를) 불렀기 때문에 컴퓨터의 난수 최대값 " + comMax + "(으)로 조정");
					} else if (userInput < target) {
						System.out.println("Up!!");
						comMin = userInput + 1;
						/*
						 * 플레이어가 부른 값이 정답보다 작은 경우, 1 큰 값으로 설정한다. ex) 답이 50일 때 사용자가 45를 불렀다면, 컴퓨터는 부를 수
						 * 있는 최소 값을 46으로 세팅한다.
						 */
						System.out.println("사용자가 " + userInput + "을(를) 불렀기 때문에 컴퓨터의 난수 최소값 " + comMin + "(으)로 조정");
					} else {
						System.out.println("플레이어가 정답을 맞췄습니다!!");
						userWin++; // 사용자 승리 1점
						comLose++; // 컴퓨터 패배 1점
						break; // 정답일 때 게임 반복문을 탈출함.
					}

					System.out.println("맞추어야 하는 정답 : " + target);
					System.out.println("컴퓨터가 다음에 부를 값 : " + comMin + " ~ " + comMax + " 사이");
					/* =========== 사용자 턴 종료 ============= */
					System.out.println("사용자 턴이 끝났습니다. ");

					/* =========== 컴퓨터 턴 시작 ============= */
					System.out.println("<< Computer Turn >>");
					int computerInput = (int) (Math.random() * (comMax - comMin + 1) + comMin);
					// 컴퓨터는 새롭게 변경된 최소, 최대 값을 바탕으로 난수를 생성하여 입력한다.

					System.out.println("InputNumber : " + computerInput);
					if (computerInput > target) {
						System.out.println("Down!!");
						comMax = computerInput - 1;
						/*
						 * 컴퓨터가 스스로 부른 값이 정답보다 큰 경우, 컴퓨터는 부를 수 있는 [최대값]을 컴퓨터 스스로가 부른 값보다 1만큼 작은 값으로
						 * 설정한다. ex)답이 50일 때 컴퓨터가 53을 불렀다면 컴퓨터는 부를 수 있는 최대 값을 52로 세팅한다.
						 */
						System.out.println("컴퓨터가 " + computerInput + "을(를) 불렀기 때문에 컴퓨터 난수 최대값 " + comMax + "(으)로 조정");
					} else if (computerInput < target) {
						System.out.println("Up!!");
						comMin = computerInput + 1;
						/*
						 * 컴퓨터가 스스로 부른 값이 정답보다 작은 경우, 컴퓨터는 부를 수 있는 [최소값]을 컴퓨터 스스로가 부른 값보다 1만큼 큰 값으로
						 * 설정한다. ex)답이 50 인데 컴퓨터가 47을 불렀다면 컴퓨터는 부를 수 있는 최소값을 48로 세팅한다.
						 */
						System.out.println("컴퓨터가 " + computerInput + "을(를) 불렀기 때문에 컴퓨터 난수 최소값 " + comMin + "(으)로 조정");
					} else {
						System.out.println("컴퓨터가 정답을 맞췄습니다!!");
						userLose++; // 사용자 패배 1점
						comWin++; // 컴퓨터 승리 1점
						break; // 컴퓨터가 정답을 맞추면 게임 반복문을 탈출한다.
					}
					System.out.println("맞추어야 하는 정답 : " + target);
					System.out.println("컴퓨터가 다음에 부를 값 : " + comMin + " ~ " + comMax + " 사이");
					// 플레이어, 컴퓨터 모두 1턴 지나감, 게임 반복문 처음으로 돌아간다.
				}
				break; // case 1: break;
			case 2:
				System.out.println("현재 스코어");
				System.out.println("플레이어 : " + userWin + "승 " + userLose + "패");
				System.out.println("컴퓨터 : " + comWin + "승 " + comLose + "패");
				break;
			case 3:
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("메뉴를 다시 확인해주세요.");
			}
		}

	}
		}





