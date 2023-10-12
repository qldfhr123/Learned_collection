package inOutput;
//default 패키지 안에서만

public class Exam1 {
	// .main method : 프로그램을 시작하면 첫번째로 실해되는것
	// static 바로 시작할수있음
	// 매개변수 : parameter, argument : 매서드를 실행하기 직전에 데이터를 저장하는 공간
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int x = a + b;
		System.out.print("a+b"+(a + b));
		/*+ :변수명 앞에 추가해줘야한다*/
		// "" 문자열의 데이터의 시작과 끝
		// \\: \출력하기 위해 사용
		/* 서식무자열 (format string)
		 	%d 정수
		 	%f 실수
		 	$s 문자
		  */
		System.out.print("\nx+b="+(x+b));
		System.out.printf("\n%.5f",0.521455878);
		// %02d = 0n 으로 출력 
		// . : 참조 연산자
	}
	 
	
}
