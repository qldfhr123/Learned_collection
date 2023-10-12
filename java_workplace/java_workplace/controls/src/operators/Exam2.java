package operators;

public class Exam2 {
	public static void main(String[] args) {
		int data1, data2;
		data1 = data2 =5;
		//오른쪽 변수는 변하지않는다
		System.out.println("data1 + 1 = "+(data1+=1));
		System.out.println("data1 - 1 = "+(data1-=1));
		System.out.println("data1 * data2 = "+(data1*=data2));
		System.out.println("data1 / data2 = "+(data1/=data2));
		System.out.println("data1 % data2 = "+(data1%=data2));
	}
}
