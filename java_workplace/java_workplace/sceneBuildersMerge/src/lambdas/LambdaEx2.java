package lambdas;

interface ILambdaEx2{
	void lambda();
}

public class LambdaEx2 {
	public static void main(String[] args) {
		// 익명 중첩
		ILambdaEx2 ex2 = new ILambdaEx2() {
			@Override
			public void lambda() {
				System.out.println("메서드 호출");
			}
		};
		ex2.lambda();
		
		ex2 = new ILambdaEx2() {
			@Override
			public void lambda() {
				System.out.println("다른 내용으로 변경하여 구현된 메서드 호출");
			}
		};
		ex2.lambda();
	}
}






