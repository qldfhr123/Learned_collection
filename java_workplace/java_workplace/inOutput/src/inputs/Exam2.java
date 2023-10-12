package inputs;

import java.io.IOException;

public class Exam2 {
	public static void main(String[] args) throws IOException {
		System.out.println("입력");
		
		int data = System.in.read();
		//int형이라 정수로 받는다
		System.out.println("입력받은 데이터 : " + data);
	}
}
