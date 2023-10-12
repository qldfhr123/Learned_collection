package inheritance3;

import java.util.ArrayList;

public class PermanentMain {

	public static void main(String[] args) {
		
	
		ArrayList<Employee>emps = new ArrayList<>();
		Employee emp1 = new Permanent("김변수",300000000);
		Employee emp2 = new Permanent("이상수",400000000);
		Employee emp3 = new Permanent("박참조",500000000);
		Employee emp4 = new PartTime("김파트",160,9500);
		Employee emp5 = new PartTime("이파트",160,1000);
		Employee emp6 = new PartTime("박파트",160,1500);
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		emps.add(emp5);
		emps.add(emp6);
		
		for(Employee emp : emps) {
			
			System.out.println("이름 : "+emp.getName());
			System.out.println("급여 : "+emp.getSalary());
		}
		
		
		
//		System.out.println("이름 : "+emp1.getName());
//		System.out.println("급여 : "+emp1.getSalary()+"원");
//		System.out.println("이름 : "+emp2.getName());
//		System.out.println("급여 : "+emp2.getSalary()+"원");
//		System.out.println("이름 : "+emp3.getName());
//		System.out.println("급여 : "+emp3.getSalary()+"원");
//		System.out.println("이름 : "+emp4.getName());
//		System.out.println("급여 : "+emp4.getSalary()+"원");
//		System.out.println("이름 : "+emp5.getName());
//		System.out.println("급여 : "+emp5.getSalary()+"원");
//		System.out.println("이름 : "+emp6.getName());
//		System.out.println("급여 : "+emp6.getSalary()+"원");
	}

}
