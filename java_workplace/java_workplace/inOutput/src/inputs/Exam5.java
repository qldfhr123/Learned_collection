package inputs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int data1 = 0;
		int data2 = 0;
	while(true) {	
		try {
			//예외 발생할수있는 코드 작성
			data1 = sc.nextInt();
			data2 = sc.nextInt();//정수 의외 데이터를 건들수없음
			
		}catch (InputMismatchException e) {
			
		//try안에 코드에서 예외가 생기면 실할할 코드
		//예외가 발생하지않으면 실행안함
			sc.nextLine(); // 그래서 청소 필수
			continue;
		}
		break;
	}
		System.out.println("입력받은 데이터 " + data1 + "," + data2);

	}

}
