package loopFor;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		Scanner input3 = new Scanner(System.in);
		
		int num1,num2;
		
		int data1;
		boolean isPrime = false; //소수를 판별하는 변수
		
		System.out.println("두수를 입력해주세요: ");
		num1=input1.nextInt();
		num2=input2.nextInt();
		int i=0;
		int sum =0;
		int max, min;
		max=num2;
		min=num1;
		if(num2<num1) {
			max=num1;
			min=num2;
		}
		for(i=min;i<=max;i++) {
			sum+=i;
		}
		System.out.println(+num1+"~"+num2+"합계: "+sum);
		
		System.out.print("수를 입력하세요: ");
		data1=input3.nextInt();
		
		for(int susu=2;susu<data1;susu++) { //1은 소수도 합성수도 아니므로 2부터 시작 소수는 자신이외의 수로 나누어지기때문에
			if(data1 % susu==0) { 
				 isPrime = true;//그러므로 true값으로 반환해주고 멈춘다
				 break;
			}
		}
		 if (isPrime) {
	            System.out.println("입력하신 수 "+data1 + " 은/는 소수가 아닙니다");
	        } 
		 else {
	            System.out.println("입력하신 수 "+data1 + " 은/는 소수입니다");
	        }
		 //string 데이터에 소수 판별유무 넣어서 하루도있다
		 

	}

}
