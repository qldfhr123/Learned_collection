package inputs;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		
		String tmp = sc.next();
		char data = tmp.charAt(0);
		
		char data2 = sc.next().charAt(0);
		System.out.print(data2);
		
		sc.close();

	}

}
