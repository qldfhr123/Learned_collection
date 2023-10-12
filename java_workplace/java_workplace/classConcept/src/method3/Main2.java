package method3;

public class Main2 {

	public static void main(String[] args) {
		
		/*
		 * static
		 * : 프로그램이 시작 후 바로 준비됨
		 * 준비됨 == 메모리에 올려두어서 바로 실행 가능한 상태
		 * 사용 목적 : 공용, 여로곳에서 바로 접근해서 사용하기 위해
		 * 
		 * 장점 : 바로 접근해서 사용
		 * 단점 : 프로그램 시작부터 종료까지 메모리를 확보함
		 * 
		 * new Sub2();
		 * 메모리에 Sub2안에 매서드를 모드 메모리공간확보
		 * 
		 * 장점 : 필요한 순간에 메모리 공간 확보,
		 * 		 사용되지 않으면 알아서 정리함(Garbage Collection)
		 * 
		 * 단점 : 클래스가 가지고 있는 멤버들이 모두 메모리공간 확보
		 * 
		 * ex) 여려개 new ~(); 할때는 static유리
		 * */
		
		
		
		
		// static 예약어를 사용하지 않은 경우
		//Sub2.mehtod()1; 사용불가
		Sub2 sub2 = new Sub2();
		sub2.mehtod1();
		 
		//static 예약어를 사용한경우
		Sub2.mehtod2();
		
		/*
		 * new Sub2();
		 * 위에 같이 인스턴스를 생성후에도
		 * 사용가능하나 권장하지 않음
		 * */

	}

}
