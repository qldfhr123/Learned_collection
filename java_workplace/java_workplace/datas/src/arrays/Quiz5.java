package arrays;

import java.util.Scanner;

public class Quiz5 {

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
		
		int i,j,tmp;
		for(i=0; i<num.length-1;i++) {
			for(j=i+1; j<num.length;j++) {
				if(num[i]>num[j]) { //오름
					tmp =num[i];
					num[i]=num[j];
					num[j]=tmp;
				}
				
			}
		}
		System.out.print("오름 차순 정렬 : ");
		for(i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println("입니다");
		
		for(i=0; i<num.length-1;i++) {
			for(j=i+1; j<num.length;j++) {
				if(num[i]<num[j]) { //내림
					tmp =num[i];
					num[i]=num[j];
					num[j]=tmp;
				}
				
			}
		}
		System.out.print("내림 차순 정렬 : ");
		for(i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println("입니다");
		
	}
}


