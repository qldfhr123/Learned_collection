package loopWhile;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수입력: ");
		int i = sc.nextInt();
		
		while(true) {
			int tmp = i%10;
			i = i / 10;
			System.out.print(tmp);
			if(i==0) {
				break;
			}
		}
	}
}
