package conditions;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		
		Scanner input4 = new Scanner(System.in);
		
		int kor,eng,math, sum,time;
		double avg;
	
		System.out.print("국어 점수: ");
		kor = input1.nextInt();
		System.out.print("영어 점수: ");
		eng = input2.nextInt();
		System.out.print("수학 점수: ");
		math = input3.nextInt();
		
		sum = kor+eng+math;
		avg = sum/3;
		if(avg >=60 && kor>=40 && eng>=40 && math >=40) {
			System.out.println("합격입니다!");
		}
		
		if (kor < 40 ) {
			System.out.println("국어 과목 점수 미달이므로 불합격입니다");
		}
		if (eng < 40 ) {
			System.out.println("영어 과목 점수 미달이므로 불합격입니다");
		}
		if (math < 40 ) {
			System.out.println("수학 과목 점수 미달이므로 불합격입니다");
		}
		else if (avg < 60) {
			System.out.println("평균 점수 미달이므로 불합격입니다");
		}
		
		System.out.print("이용시간을 입력하세요: ");
		time = input4.nextInt();
		int pay = 3000, addPay = 500;
		int total = pay;
			if(time > 30) {
				 int useTime = time - 21;
				 int add = (useTime / 10) * addPay;//추가 요금계산
				 total += add;
				 System.out.println(+time+ "분 만큼 이용하셨습니다 추가시간은: "+useTime+ "분입니다. 요금은: "+total);
			}
			else {
				System.out.println("기본요금 만큼 부과됩니다");
			}
			
			
			
		
		
		
	}

}
