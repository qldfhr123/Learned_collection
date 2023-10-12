package operators;

public class Exam6 {
	public static void main(String[] args) {
		int data1, data2, data3;
		
		data1=10; 
		data2 = ++data1;
		
		data1=10; 
		data3 = data1++;
		
		System.out.println(+data1);
		System.out.println(+data2);
		System.out.println(+data3);
		
		data1 = 10;
		data2 = 20;
		
		int sum = ++data1 + data2++;
		System.out.println(sum);
		
		
		
	}
}
