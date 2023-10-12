package loopFor;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("반복횟수 : ");
		int repeat = in.nextInt();
		int i=1;
		for(i=1; i <=repeat; i++) {
			System.out.println(i);
		}
		i = 1;
		for(;i <=repeat;i++) {
			System.out.println(i);
		}
		i = 1;
		for(;i <=repeat;) {
			System.out.println(i);
		}


	}

}
