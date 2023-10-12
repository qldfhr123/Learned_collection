package arraysets;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam1 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>(); //데이터 입력 필수
		hs.add("라0");
		hs.add("라9");
		hs.add("라8");
		hs.add("라7");
		System.out.println("HashSet : "+hs);
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("라1");
		arr.add("라2");
		arr.add("라3");
		arr.add("라4");
		System.out.println("ArrayList : "+arr);
		
		
	}

}
