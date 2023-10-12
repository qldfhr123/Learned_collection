package inheritance5;

public class Permanent extends Employee{
	private int salary;
	
	public Permanent(String name, int salary) {
		setName(name);
		this.salary = salary;
	}

	//재정의 : 부모가 준 메서드의 머리는 그대로, 내용만 변경하는 개념
	
	public int getSalary() {
		return salary;
	}
}
