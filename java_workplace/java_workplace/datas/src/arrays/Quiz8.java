package arrays;

import java.util.Random;

public class Quiz8 {

	public static void main(String[] args) {
		Random num = new Random();
		
		int arr[][] = new int [5][5];
	
		for(int i = 0;i <arr.length; i++){
			for(int j = 0;j <arr.length; j++) {
				int data = num.nextInt(10);
				 arr[i][j]=data;
			}
		}
		for(int i = 0;i <arr.length; i++){
			for(int j = 0;j <arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		Random text = new Random();
		char arr2[][] = new char [5][5];
		for(int i = 0;i <arr2.length; i++){
			for(int j = 0;j <arr2.length; j++) {
				 arr2[i][j]=(char) ((int) (text.nextInt(26)) + 97);
			}
		}
		for(int i = 0;i <arr2.length; i++){
			for(int j = 0;j <arr2[i].length; j++) {
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();

		}
				
}
}