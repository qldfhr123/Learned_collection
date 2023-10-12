package methodExam;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTotal() {
		int total=0;
		total=(kor+eng+math);
		return total;
	}
	
	public double getAverage() {
		double average;
		average=(getTotal()/3.0);
		String tmp = String.format(".2%",average);
		average=Double.parseDouble(tmp); //static 이 붙지않아서 new하지 않고 바로 클래서접근
		return average;
	}
	
}
