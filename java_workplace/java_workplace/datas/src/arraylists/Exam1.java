package arraylists;

import java.util.ArrayList;

public class Exam1 {

	public static void main(String[] args) {
		ArrayList <String>list = new ArrayList<String>();
		
		/*
		 * <자료형> : Generic
		 */
	
		
		
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(String s:list) {
			System.out.println(s);
		}

	}

}
