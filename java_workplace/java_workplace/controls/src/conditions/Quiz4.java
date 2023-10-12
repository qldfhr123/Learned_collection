package conditions;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		
		int data1, data2, data3, data4, max ,min;
		
		System.out.println("세 수를 입력해주세요 :");
		data1 = input1.nextInt();
		data2 = input2.nextInt();
		data3 = input3.nextInt();
		//max, min 변수지정
		max = data1;
		min = data2;
		//입력된 두 수부터 크기 비교
		if(data1 < data2) {
			max = data2;
			min = data1;
		}
		//마지막 수의 크기를 비교
		if(max < data3) 
			max = data3;
		else if (min >data3)
			min = data3;
		
		System.out.println("가장 큰수는 :"+max+"작은수는 :"+min);
		
		System.out.print("수 를 입력해주세요: ");
		data4 = input4.nextInt();
		if(data4 % 12 == 0 && data4!=0) {
			System.out.println("["+data4+"]은/는 3의 배수이면서, 4의배수입니다");
		}
		else if(data4 % 3 == 0 && data4!=0) {
			System.out.println("["+data4+"]은/는 3의 배수입니다");
		} 
		else if(data4 % 4 == 0 && data4!=0) {
			System.out.println("["+data4+"]은/는 4의 배수입니다");
		}
		else if(data4 % 12 != 0 && data4!=0) {
			System.out.println("["+data4+"]은/는 3의 배수도, 4의배수도 아닙니다");
		}
		else{
			System.out.println("0을 입력하셨습니다.");
		}
	}

}
