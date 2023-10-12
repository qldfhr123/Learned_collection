package variable;

public class Exam9 {

	public static void main(String[] args) {
		byte b = 97;
		short s = 20;
		char c = 'A';
		
		float f = 1.23f;
		
		s = b;
		c = (char)b;
		s = (short)c;
		double d = 5.11;
		f = (float)5.11;
		f = (float)d;
	}

}
