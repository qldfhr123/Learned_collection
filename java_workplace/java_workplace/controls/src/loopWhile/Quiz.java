package loopWhile;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("‘q’가 입력될 때 까지 반복");
		while (true) {
			System.out.print("입력 : ");
			char data = sc.next().charAt(0); //toLowerCase()
			System.out.println("결과 : " + data);
			if (data == 'q' || data == 'Q')
				break;
		}
		Scanner input = new Scanner(System.in);
		
		int sum=0, num=0;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		while(num!=0){
			sum += num%10;
	        num /= 10;
     }
		System.out.println("입력된 수의 자리수합계 : " + sum);
		
		Scanner input2 = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int nuM;
		int reverse = 0;
		System.out.print("수 입력 : ");
		nuM = input2.nextInt();
		
		while(nuM!=0){
			reverse=reverse*10+nuM%10; //reverse*10따로 곱해줄수도 있음
			/*
			 어떤수를 10으로 나누면 마지막 수가 남는다 처음에는 reverse가 0이기 때문에 
			 마지막수가 제일 앞으로 나온다 그 이후는 10씩 곱해서 순서대로 정렬
			*/
			nuM/=10;
			//list.add(reverse);//리스트에 담기
			if(nuM==0) {
				break;
			}
     }
		//System.out.println("결과 : " + list);
		System.out.println(+nuM+" 리버스 결과 : " + reverse);
		
	}
	
}
