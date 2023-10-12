package switchs;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
	
		System.out.print("문자 입력: ");
		String select = input1.next();
		
		
		/* if(slect.equal("1")){
		 * 	System.out.println("case 1:" +select); 
		 * }
		 * else if(slect.equal("2")){
		 * 	System.out.println("case 1:" +select); 
		 * }
		 * .
		 * .
		 * .
		 * switch 대신 if로 할수있음
		 */
		
		switch(select) {
		case "1": System.out.println("case 1:" +select); break;
		case "2": System.out.println("case 2:" +select); break;
		case "3": System.out.println("case 3:" +select); break;
		default: System.out.println("default : 1,2,3 아닌 단어");
		}
		System.out.print("다음문장");
	}

}