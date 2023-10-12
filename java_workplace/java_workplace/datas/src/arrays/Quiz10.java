package arrays;

import java.util.Scanner;
import java.util.Random;

public class Quiz10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		 

		System.out.println("==== 아파트 입주자 정보 ====");
		System.out.print("건물 총 층수 입력 : ");
		int num = sc.nextInt();
		System.out.println(num+"층이 생성 되었습니다.");

		int [][]floor = new int[num][];
		int []arr = new int[num];//층마다 방개수
		int input;
		String [][] room = new String[num][];
		 
		  
		 for(int i=0; i<num; i++) {
		  System.out.print((i+1)+"층의 총 호실 입력 : ");
		  	input = sc.nextInt();
		  	floor[i]=new int[input];
		    arr[i]=input;
		    room [i]=new String[input];
		    
		   }//2층입력
		 	//floor[0][1]=5;
		 	//floor[0][2]=6;

		  for(int i=0; i<num; i++) {
		   System.out.println((i+1)+" 층은 " + arr[i]+" 호실까지 있습니다");
		  }//0층 1
		   //1층 1

		  System.out.println("각 호실마다 입주자의 이름을 입력하세요");

		  for(int i=0; i<num; i++) {
		   System.out.println("========= " + (i+1)+"층 정보 입력 =========");
		   for(int j=0; j<arr[i]; j++) {
		    System.out.print((i+1)+"층"+(j+1)+"호 입주자 :");
		    room[i][j] = sc.next();
		   }
		   
		  }

		  System.out.println("==== 입주자 정보 ====");
		  for(int i=0; i<num; i++) {
		   for(int j=0; j<arr[i]; j++) {
		    System.out.println((i+1)+"층 "+(j+1)+"호실 입주자: "+room[i][j]+"");
		   }
		  }

	}

}
