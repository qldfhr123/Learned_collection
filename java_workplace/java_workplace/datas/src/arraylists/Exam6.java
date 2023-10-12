package arraylists;

import java.util.ArrayList;

public class Exam6 {

	public static void main(String[] args) {
		ArrayList <String>list = new ArrayList();
		
		String data1 = "김변수";
		String data2 = "이변수";
		String data3 = "박변수";
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		list.add("최변수");
		
	
		System.out.println("남겨져 있는데이터 수 : "+list);
		System.out.println("데이터 존재 유무 "+list.isEmpty()); //true
		
		list.clear();
		
		System.out.println("남겨져 있는데이터 수 : "+list);
		System.out.println("데이터 존재 유무 "+list.isEmpty());//flase
	}

}