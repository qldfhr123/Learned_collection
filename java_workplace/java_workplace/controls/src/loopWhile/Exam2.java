package loopWhile;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i=0 ,sum=0;
		boolean loopFlag = true;
		
		while(loopFlag) {
			System.out.print("수입력");
			i = sc.nextInt();
			if(i>=1 && i<=100) {
				loopFlag = false;
			}
			else
				System.out.println("다시");
		}
		
		for(int j =1; j<=i; j++) {
			sum+=j;
		}
		System.out.println(sum);
		
	}
}
