package conditions;

import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		int data1;
		System.out.println("수 입력");
		data1 = input1.nextInt();
		
		if(data1>100) {
			System.out.println(+data1+" :100보다 크다!");
		}
		else if (data1 > 50) {
			System.out.println(+data1+" :50보다 크다!");
		}else {
			System.out.println(+data1+" :50보다 작다!");
		}
		
	}

}
