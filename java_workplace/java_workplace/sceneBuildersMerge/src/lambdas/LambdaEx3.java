package lambdas;

interface ILambdaEx3{
	void lambda();
}

public class LambdaEx3 {
	public static void main(String[] args) {
		// 하나 밖에 없는 추상메서드를 갖은 인터페이스
		// 람다식을 사용할 수 있음.
		ILambdaEx3 ex3 = () -> {
			System.out.println("메서드 호출");
		};
		ex3.lambda();
		
		ex3 = () -> {
			System.out.println("다른 내용으로 변경하여 구현된 메서드 호출");
		};
		ex3.lambda();
		ex3.lambda();
	}
}






