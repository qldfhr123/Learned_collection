package arraylists;

import java.util.ArrayList;

public class Exam2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		/*
		 * <자료형> : Generic
		 * 
		 */
		list.add("1");
		list.add("1.1");
		list.add("문자열");
		list.add("문");
		
		for(int i = 0; i < list.size() ;i++)
			System.out.println("데이터 : " + list.get(i));

		for(String s : list) {
			System.out.println("데이터 : " + s);
		}
		
	}

}





