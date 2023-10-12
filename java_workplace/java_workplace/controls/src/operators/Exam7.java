package operators;

public class Exam7 {

	public static void main(String[] args) {
		int data = 8;
		String s = (data % 2 ==0)? "짝수":"홀수"; //true : false
		System.out.println(data + " = " + s);
		
		data = 9;
		s = (data % 2 == 0)? "짝수":"홀수";
		System.out.println(data + " = " + s);
		
		int data2 = 10;
		String result = (data2 >= 10 || data2 < 5)? "참일때 반환할 문장" : "거짓일떄 반환할 문장";
		System.out.println(result);
	}

}
