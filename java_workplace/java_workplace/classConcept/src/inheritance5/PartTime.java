package inheritance5;
//3명의 이름, 시간, 시급입력
public class PartTime extends Employee implements IEmployee{

	
	private int pay;
	private int time;
	public static final double PI = 3.14;
	
	//using Fields
	public PartTime(String name, int time, int salary) {
		super();//부모의 생상자를 호출
		//this(); 자신의 생성자를 호출
		super.setName(name);
		this.time = time;
		this.pay = salary;
		
	}


	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {
		
	}
	
	@Override
	public int getSalary() {
		return time*pay;
	}
	
}
