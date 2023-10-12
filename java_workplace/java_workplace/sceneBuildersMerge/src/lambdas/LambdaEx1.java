
package lambdas;
//추상메서드 2개이상일때 람다 불가능, 클래스를 만들어서 인스턴스로 만들어야한다
interface ILambdaEx1{
	void lambda();
}

class LambdaImplEx1 implements ILambdaEx1{
	@Override
	public void lambda() {
		System.out.println("메서드 호출");
	}
}

public class LambdaEx1 {
	public static void main(String[] args) {
		LambdaImplEx1 ex1 = new LambdaImplEx1();
		ex1.lambda();
	}
}
