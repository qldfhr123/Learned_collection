package variable;

public class Exam7 {

	public static void main(String[] args) {
		int data = 123, result;
		
		data = data + 12;
		
		char ch = 'D';
		ch = (char)(ch + 3);
		result = data + ch; //133 + 'G'(71);
		
		System.out.println(data);
		System.out.println(ch);
		System.out.println((int)ch); // (자료형) : cast 연산자,casting
		System.out.println(result);

	}

}
