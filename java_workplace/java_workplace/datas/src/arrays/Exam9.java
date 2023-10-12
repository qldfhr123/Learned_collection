package arrays;

import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("몇행의 배열을 만드시겠습니다? : ");
		int legth = input.nextInt();
		int [][] arr = new int[legth][];
		System.out.println("각행에 바열을 만드세요!! ");
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(i+1+"번쨰 행의 배열");
			int n = input.nextInt();
			arr[i] = new int [n];
		}
		for(int i = 0;i <arr.length; i++){
			for(int j = 0;j <arr.length; j++) {
				arr[i][j] = j++;
			}
		
		}
		for(int i = 0;i <arr.length; i++){
			for(int j = 0;j <arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
	}
	}
}
