package arraysets;

import java.util.HashSet;
import java.util.Iterator;

public class Exam5 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("1.대부");
		hs.add("2.반지의제왕");
		hs.add("3.겨울왕국");
		hs.add("4.다크나이트");
		hs.add("5.해리포터");
		hs.add("6.공공의적");
		
		for(String data : hs) {
			System.out.println(data);
		}//가독성이 좋다
		
		System.out.println();
		Iterator<String> it = hs.iterator();//
		while(it.hasNext()) { //데이터 존재유무 확인
			String data2 = it.next();//저장공간에 데이터 반환
			System.out.println(data2);
		}
		

	}

}
