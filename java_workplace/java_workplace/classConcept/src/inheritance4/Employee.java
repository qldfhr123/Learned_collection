package inheritance4;


//추상클래스 : 추상매서드 한개이상 포함하고있을때
public abstract class Employee {
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * 추상메서드 : 내용이 구현되지 않은 매서드
	 * -자식에게 내용을 강제로 구현하도록 만든다는 의미
	 */
	
	public abstract int getSalary();
	
	//매서드 강제성이 없다
//	public int getSalary() { 
//		return 0;
//	}
	
	
}
