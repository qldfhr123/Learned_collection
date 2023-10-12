package conditions;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		int data1, data2;
		
		System.out.print("수를입력해주세요");
		data1 = input1.nextInt();
		if(data1%5==0) {
			System.out.println("입력 : "+data1+", 결과 : 5의 배수입니다");
		}else {
			System.out.println("입력 : "+data1+", 결과 : 5의 배수가 아닙니다");
		}
		
		System.out.print("수를입력해주세요");
		data1 = input1.nextInt();
		if(data1>0 && data1<100) {
			System.out.println(+data1+"는/은 적중범위 0 ~ 100 사이에있습니다");
		}else {
			System.out.println(+data1+"는/은 6적중범위 0 ~ 100 있지않으므로 비적중범위입니다");
		}
		
		System.out.print("수를입력해주세요");
		data1 = input1.nextInt();
		//	%6 최소공배수를 사용해서 출력할수도 있음
		if(data1%2==0 && data1%3==0) {
			System.out.println(+data1+"는/은 짝수이면서 3의배수입니다!");
		}else {
			System.out.println(+data1+"는/은 짝수도 아니고 3의 배수도 아닙니다");
		}

	}

}
