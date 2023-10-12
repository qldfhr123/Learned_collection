package loopFor;

public class Exam2 {
	public static void main(String[] args) {

		int evenTotal = 0;
		int oddTotal = 0;
		for(int i = 1; i <=100; i++) {
			if(i %2 ==0) 
				evenTotal =evenTotal+i;
			else
				oddTotal +=i;
		}
		System.out.println(evenTotal);
		System.out.println(oddTotal);
	}
}
