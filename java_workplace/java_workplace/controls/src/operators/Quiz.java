package operators;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//짝수 홀수 구분
		System.out.print("수를 입력해주세요 :");
		int num = sc.nextInt();
		String result = (num % 2 == 0)? "짝수":"홀수";
		System.out.println(result);	

		//3의배수
		System.out.print("수를 입력해주세요 :");
		int num3 = sc.nextInt();
		String result2 = (num3 % 3 == 0) ? "3의배수입니다" : "3의배수가 아닙니다"; // true : false
		System.out.println(result2);

		//두수 비교
		System.out.print("비교할 두 수를 입력해주세요 :");
		int oneNum = sc.nextInt();
		int lastNum = sc.nextInt();
		
		if (oneNum < lastNum) {
			System.out.println("큰수는 : " +lastNum);
		}else if (lastNum < oneNum) {
			System.out.println("큰수는 : " +oneNum);
		}
		//다른것
		System.out.print("비교할 두 수를 입력해주세요 :");
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		
		int max = (data1 > data2)? data1:data2;
		System.out.println(data1 +"과/와" +data2+ "중큰수는" +max +"입니다");
		
		 //result = (data1 == data2)?  +"과/와" +data2+ "중큰수는" +result+ "동일한수입니다" :(); //그냥 조건문 써야겠다
		sc.close();
	}
}
