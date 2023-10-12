package methodExam;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Absolute ab = new Absolute();
		Grade gr = new Grade();
		
		System.out.print("절대값을 구할수 입력 : ");
		ab.setData1(sc.nextInt());
		System.out.println(+ab.getData1()+" 의 절대값은 : "+ab.AbsoluteNum());
		
		
		System.out.print("점수를 입력해주세요 : ");
		gr.setData1(sc.nextInt());
		System.out.print(+gr.getData1()+" 점은 " +gr.grade()+" 학점입니다");
	}

}
