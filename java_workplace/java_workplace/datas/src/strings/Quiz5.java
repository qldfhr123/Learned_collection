package strings;

public class Quiz5 {

	public static void main(String[] args) {
		String data = "김개똥-2017년\n홍길동구리-2015년\n선우선녀-2018년 ";
		System.out.println("==== 변경 전  ====");
		System.out.println(data);
		
		data = data.replace("-", ":");
		data = data.replaceAll("[0-9][0-9][0-9][0-9]", "1999");
		System.out.println("==== 변경 후  ====");
		System.out.println(data  );
	}

}




