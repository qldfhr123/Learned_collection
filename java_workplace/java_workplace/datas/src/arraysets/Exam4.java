package arraysets;

import java.util.HashSet;

public class Exam4 {

	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		
		System.out.println(hs.isEmpty());
		boolean bool;
		
		bool = hs.add(123); System.out.println(bool);
		bool = hs.add(456); System.out.println(bool);
		bool = hs.add(789); System.out.println(bool);
		
		System.out.println(hs.isEmpty());

		if(hs.contains(456)) {
			System.out.println("데이터 존재");
		}
		else {
			System.out.println("데이터 존재하지않습니다");
		}
		

	}

}
