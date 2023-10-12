package methodExam;

public class EvenOdd2 {
	/* private : 현재 인스턴스 안에서만 접근 가능
	 * 인스턴스 : 클래스를 실행한 상태
	 * 안에서만 접근가능 : 멤버 매서드와 같은 멤버들만 접근 가능
	 */
	private int data;
	
	//맴버필드, 멤버변수 값입력하는 가능
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public boolean tests() {
		//짝수 또는 홀수를 판별하는 데이터
		if(data % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
