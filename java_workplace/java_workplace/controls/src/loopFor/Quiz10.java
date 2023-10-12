package loopFor;

import java.util.ArrayList;

public class Quiz10 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); //타입 선언필수
		for(int i=1;i<=1000;i++){
			int sum=0;
			for(int d=1; d<i; d++){
				if(i%d == 0) {
					sum+=d;
				}	
			}
			if(sum==i) {
				list.add(i);
			}
		}	
		System.out.println("1 ~ 1000 사이의 완전수는: "+list);
	}
}


