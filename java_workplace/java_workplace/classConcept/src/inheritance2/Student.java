package inheritance2;

public class Student extends Person{
	
	private String subject;
	
	

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void info() {
		System.out.println("이름 : " + super.getName());//부모의것(둘다 같은 매서드가 있다면 구분을위해 super필수)
		System.out.println("나이 : " + getAge());
		System.out.println("과목 : " + subject);
	}
	
}
