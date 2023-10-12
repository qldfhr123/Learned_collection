package variable;

public class Exam2 {
	public static void main(String[] args) {
		float floatData = 3.14f;
		double doubleData = 3.14;
		System.out.println("doubleData :"+ doubleData);
		System.out.println("floatData :" + floatData );
		
		char charData1 = '가';
		String strData = "나다라마바사아가가나나나";
		char charData3 = strData.charAt(0);
		char charData5 = strData.charAt(5);
		System.out.println(strData + charData1);
		System.out.println(charData3);
		System.out.println(charData5);
		
	}
}
