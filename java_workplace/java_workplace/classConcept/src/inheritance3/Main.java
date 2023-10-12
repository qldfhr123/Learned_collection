package inheritance3;

public class Main {
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
	
//		test1(child1);
//		test2(child2);		
		
		test(child1);
		test(child2);
	}
	public static void test(Parent p) { //Child1 모두 실행 부모에게 넣는이유 매서드를 하나만 만들기위해
		p.mehtod1();
		p.mehtod2();
		//중복을 줄일수있다
		
		if (p instanceof Child1) {
			Child1 child1 = (Child1)p; //동일하게 캐스트 연산을 사용
			child1.mehtod3();
			
		}
		else if(p instanceof Child2) {
			Child2 child2 = (Child2)p; 
			child2.mehtod3();
		} 
		
		
	}
	
	public static void test1(Child1 child1) {
		child1.mehtod2();
		child1.mehtod3();
	}
	public static void test2(Child2 child2) {
		child2.mehtod2();
		child2.mehtod3();
	}
}
