package arrays;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		
		
		System.out.print("생성할 배열의 길이를 입력 : ");
		input=sc.nextInt();
		int [] num= new int[input];
		System.out.println(input+"개의 배열이 생성되었습니다.");
		for (int i = 0; i < num.length; i++) {
			System.out.print(i+1+"번째 데이터 : ");
			num[i] = sc.nextInt();
		}
		System.out.print("배열 데이터 : ");
		for (int i = 0; i < num.length; i++) 
			System.out.print(num[i]+" ");
		
		System.out.println("입니다");
		
		
	}

}
