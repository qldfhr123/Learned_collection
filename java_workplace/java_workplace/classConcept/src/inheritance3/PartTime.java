package inheritance3;
//3명의 이름, 시간, 시급입력
public class PartTime extends Employee{

	
	private int pay;
	private int time;
	
	//using Fields
	public PartTime(String name, int time, int salary) {
		super();//부모의 생상자를 호출
		//this(); 자신의 생성자를 호출
		super.setName(name);
		this.time = time;
		this.pay = salary;
		
	}

	
	public int getSalary() {
		return time*pay;
	}
	
	
}
