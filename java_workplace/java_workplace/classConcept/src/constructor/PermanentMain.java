package constructor;

public class PermanentMain {

	public static void main(String[] args) {
		Permanent permanent1 = new Permanent("김변수",300000000);
		Permanent permanent2 = new Permanent("이상수",400000000);
		Permanent permanent3 = new Permanent("박참조",500000000);
		
		System.out.println("이름 : "+permanent1.getName());
		System.out.println("급여 : "+permanent1.getSalary()+"원");
		
		System.out.println("이름 : "+permanent2.getName());
		System.out.println("급여 : "+permanent2.getSalary()+"원");
		
		System.out.println("이름 : "+permanent3.getName());
		System.out.println("급여 : "+permanent3.getSalary()+"원");
		
		PartTime partTime1 = new PartTime("김파트",160,9500);
		PartTime partTime2 = new PartTime("이파트",160,1000);
		PartTime partTime3 = new PartTime("박파트",160,1500);
		
		System.out.println("이름 : "+partTime1.getName());
		System.out.println("급여 : "+partTime1.getSalary()+"원");
		System.out.println("시간 : "+partTime1.getTime()+"시간");
		
		System.out.println("이름 : "+partTime2.getName());
		System.out.println("급여 : "+partTime2.getSalary()+"원");
		System.out.println("시간 : "+partTime1.getTime()+"시간");
		
		System.out.println("이름 : "+partTime3.getName());
		System.out.println("급여 : "+partTime3.getSalary()+"원");
		System.out.println("시간 : "+partTime1.getTime()+"시간");

	}

}
