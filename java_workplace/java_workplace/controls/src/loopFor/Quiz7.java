package loopFor;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
      
    System.out.print("줄수를 입력해주세요: ");
    int i,j, star,line ,space;
    line = sc.nextInt();
	star =1;
	space = line/2; //여백 조절
	
	for(i=0; i<line; i++) {
		for(j=0; j<space; j++) {
			System.out.print(" ");
		}
		for(j=0; j<star; j++)	
			System.out.print("*");
		
		System.out.println();
		
		
		if(i < line / 2){ //라인위치 확인
			star +=2;
			space--;
		}
		else {
			star -=2;
			space++;
		}
	}
   }
}

