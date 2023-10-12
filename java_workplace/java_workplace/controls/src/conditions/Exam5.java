package conditions;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		int data1, data2 ,max ,min;
		System.out.println("수 입력");
		data1 = input1.nextInt();
		data2 = input1.nextInt();
		
		if(data1>data2) {
			max = data1;
			min = data2;
		}
		else  {
			max = data2;
			min = data1;
		}
		
	}

}
