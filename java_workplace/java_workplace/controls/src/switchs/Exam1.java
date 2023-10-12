package switchs;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		int select;
		System.out.print("입력: ");
		select = input1.nextInt();
		switch(select) 
		{
		case 1: System.out.println("case 1:" +select); break;
		case 2: System.out.println("case 2:" +select); break;
		case 3: System.out.println("case 3:" +select); break;
		default: System.out.println("default : 1,2,3 아닌수");
		}

	}

}
