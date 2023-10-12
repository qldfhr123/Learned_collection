package maps;

import java.util.HashMap;

public class Exam1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(0, "test1"); //키를지정후 값을 저장
		hm.put(1, "hi~");
		
		System.out.println(hm.get(0));
		System.out.println(hm.get(1));

	}

}
