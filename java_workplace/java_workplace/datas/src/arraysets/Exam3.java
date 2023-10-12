package arraysets;

import java.util.HashSet;

public class Exam3 {

	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		
		
		boolean bool;
		
		bool = hs.add(123); System.out.println(bool);
		bool = hs.add(456); System.out.println(bool);
		bool = hs.add(789); System.out.println(bool);
		
		

		System.out.println(hs);
		System.out.println(hs.remove(123));
		System.out.println(hs.remove(789));
		System.out.println(hs.remove(000));
		System.out.println(hs);
		

	}

}
