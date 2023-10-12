package maps;

import java.util.HashMap;

public class Exam2 {

	public static void main(String[] args) {
		HashMap hm = new HashMap<>();
		
		hm.put(0, "11000"); 
		hm.put(1, "hello");
		hm.put("naver", "https://www.naver.com/");
		
		System.out.println(hm.get(0));
		System.out.println(hm.get(1));
		System.out.println(hm.get("naver"));
		System.out.println(hm);
		
	}

}
