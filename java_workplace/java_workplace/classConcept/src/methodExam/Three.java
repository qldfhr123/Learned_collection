package methodExam;

public class Three {

private int data;//this.data 데이터이다

	public void setData(int data)/*이 데이터랑 같다*/ {
		this.data = data;
					//이 데이터는 그래서 this 로 지정해야한다
		
	   /* 
		*  this:자기 자신 Three:인스턴스
		*  this는 자기 자신의 인스턴스 참조값
		*  
		*  Three three = new Three();
		*  this==three
		*  
		*/
	}
	public int getData() {
		return data;
	}
	
	public boolean result() {
		if(data % 3 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
