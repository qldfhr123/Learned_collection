package conditions;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		//세수
		Scanner input4 = new Scanner(System.in);
		Scanner input5 = new Scanner(System.in);
		
		Scanner input6 = new Scanner(System.in);
		Scanner input7 = new Scanner(System.in);
		
		int data1, data2, data3, data4, data5, data6, data7;
		
		/*
		 * int max
		 * max = data1
		 * if(max<data2)
		 * data2=max
		*/
		System.out.println("세 수 입력");
		data1 = input1.nextInt();
		data2 = input2.nextInt();
		data3 = input3.nextInt();
	
		if(data1>data2 && data1>data3) {
			System.out.println("세 수 가장큰수는"+data1);
		}
		if(data2>data1 && data2>data3) {
			System.out.println("세 수 가장큰수는"+data2);
		}
		if(data3>data1 && data3>data2) {
			System.out.println("세 수 가장큰수는"+data3);
		}
		
		System.out.println("두 수 입력");
		data4 = input4.nextInt();
		data5 = input5.nextInt();
		
		if(data4>data5 && data4>data5) { //2개 이상의 조건 참거짓 구분할때
			if(data4 % 2 == 0) {
			System.out.println("두수 비교중 짝수는"+data4);
			}
			else {
				System.out.println("두수중 큰수는"+data4 + "이지만 짝수는 아닙니다");
			}
		}
		if(data4<data5 && data4<data5) {
			if(data5 % 2 == 0) {
			System.out.println("두수 비교중 짝수는"+data5);
			}
			else {
				System.out.println("두수중 큰수는"+data5 + "이지만 짝수는 아닙니다");
			}
		}
		
		System.out.println("두 수 입력");
		data6 = input6.nextInt();
		data7 = input7.nextInt();
		  int sum;
		  sum = data6 + data7;
		  
		if(sum%2==0 && sum%3==0) { //전부 만족
			System.out.println("입력하신 두수의 합은"+sum+"이고 짝수이면서 3의 배수입니다");
		}
		else if(sum%2==0 && sum%3!=0){
			System.out.println("입력하신 두수의 합은"+sum+"이고 짝수이면서3의 배수는 아닙니다");
		}
		else if (sum%2!=0 && sum%3==0) {
			System.out.println("입력하신 두수의 합은"+sum+"이고 짝수는 아니지만 3의 배수입니다");
		}
		else if (sum%2!=0 && sum%3!=0) {
			System.out.println("입력하신 두수의 합은"+sum+"이고 짝수는 아니지만 3의 배수도 아닙니다");
		}
		
	}

}
