package inheritance5;

//추상 매서드들을 가지고있는 클래스를 인터페이스라고 한다
public interface IEmployee {
	/*
	 * public abstract void method1
	 * 생략가능
	 * */
	
	void method1();
	void method2();
	
	int getSalary();
	
	/*
	 * 상수와 같은 형식의 데이터를 변수로 만들어 쓸때 사용함
	 * 
	 * public static final double PI = 3.14;
	 * public static final 생략 가능
	 */
	
	double PI = 3.14;
}
