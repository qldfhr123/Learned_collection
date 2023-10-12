package loopWhile;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력");
		int data1 = sc.nextInt();
		
		for(int i=3; i<=data1;i++) {
			int tmp=i;
			while(true) {
				int j= tmp%10;
				tmp/=10;
				if(j==3||j==6||j==9) {
					count++;
					//System.out.println(i);//조건에 해당하는 값
				}
				if(tmp==0) 
					break;
				
			}
		}
		System.out.println("카운트 횟수"+count);
	}
}
