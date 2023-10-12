package switchs;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		char select;
		System.out.print("문자 입력: ");
		select = input1.next().charAt(0); //97 65 48
		switch(select) 
		{
		case 'a': System.out.println("case 1:" +select); break;
		case 'A': System.out.println("case 2:" +select); break;
		case '0': System.out.println("case 3:" +select); break;
		default: System.out.println("default : a,A,0 아닌 단어");
		}
		System.out.print("다음문장");
	}

}