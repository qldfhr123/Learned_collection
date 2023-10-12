package inheritance3;

public class Employee {
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() { //중복시 메서드는 같아야한다
		return 0;
	}
	
	
}
