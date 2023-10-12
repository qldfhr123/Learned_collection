package conditions;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		
		int data1, data2, data3, data4;
		
		System.out.println("수 입력");
		data1 = input1.nextInt();
		if(data1 % 3 ==0) {
			System.out.println("3의 배수입니다");
		}
		else {
			System.out.println("3의 배수가 아닙니다");
		}
		System.out.println("수 입력");
		data2 = input2.nextInt();
		int result = data2;
		if(data2 > 0) {
			System.out.println(+data2+" 의 절대값은 : "+data2);
		}
		else if(data2 < 0){
			result = -data2;
			System.out.println(+data2+" 의 절대값은 : " +(data2*-1));
		}
		
		System.out.println("수 입력");
		data3 = input3.nextInt();
		System.out.println("수 입력");
		data4 = input4.nextInt();
		if(data3>data4) {
			System.out.println("큰수는"+data3);
		}
		else if(data3<data4) {
			System.out.println("큰수는"+data4);
		}
		else if(data3==data4) {
			System.out.println("두수는 같은수입니다");
		}
		input1.close();
		input2.close();
		input3.close();
		input4.close();
		
	}

}
