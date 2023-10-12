package constructor;
//3명의 이름, 시간, 시급입력
public class PartTime {

	private String name;
	private int salary;
	private int time;
	
	//using Fields
	public PartTime(String name, int time, int salary) {
		super();//부모의 생상자를 호출
		//this(); 자신의 생성자를 호출
		this.name = name;
		this.time = time;
		this.salary = salary;
		
	}
	public String getName() {
		return name;
	}
	public int getTime() {
		return time;
	}
	public int getSalary() {
		return time*salary;
	}
	
	
}
