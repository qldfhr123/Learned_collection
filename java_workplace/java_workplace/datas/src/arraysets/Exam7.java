package arraysets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Exam7 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("1.대부");
		hs.add("2.반지의제왕");
		hs.add("3.겨울왕국");
		hs.add("4.다크나이트");
		hs.add("5.해리포터");
		hs.add("6.공공의적");
		
		ArrayList<String> list = new ArrayList<>(hs); //array list저장할수있다
		
		System.out.println(list);
		Collections.reverse(list);//오름차순 되어 있는 데이터를 내림차순으로 변경
		System.out.println(list);
	}

}
