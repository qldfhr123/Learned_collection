package conditions;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		
		int data;
		String message;
		
		System.out.print("수입력해주세요 :");
		data = input1.nextInt();
		
		if(data % 2==0) {
			if(data%3==0) {
				message = data + "는/은 짝수이고 ,3의배수이다";
			}else {
				message = data + "는/은 짝수이지만 ,3의배수아니다";
			}
		}else {
			if(data%3==0) {
				message = data + "는/은 홀수이고 ,3의배수이다";
			}else {
				message = data + "는/은 홀수이지만 ,3의배수아니다";
			}
		}
		System.out.println(message); //출력은 나중에 호출할수있다
	}

}
