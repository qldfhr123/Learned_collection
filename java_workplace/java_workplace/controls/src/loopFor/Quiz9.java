package loopFor;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		int data;
		int count=0;
		System.out.print("입력: ");
		data=sc.nextInt();
		if(data<2) {
			System.out.println("다시입력하세요");
		}
		for(int i=2; i<=data;i++) {
			for(int d=2; d<=i; d++)
				if(i%d == 0) {
					count++; //나누어 떨어지면 증가 ex) 4는 2,4로 나누어 지니까 2번 나누어 떨어지는것 그래서 2번증가
			}
			if(count == 1) { //나누어 떨어진횟수 1이면
				list.add(i); //리스트에 담기
				count = 0;   //그리고 다시 카운트 초기화
			}
			else {
				count = 0; 
			}
		}
		System.out.println("2부터 "+data+"까지의 소수 : "+list);
		
		byte x,y;
		for(x=0;x<=10;x++) {
			for(y=0;y<=10;y++) {
				if (((3 * x) + (2 * y)) == 10) {
				     System.out.print("x :" +x );
				     System.out.println(" y :" +y );
				    }
			}
		}
	}

}
