package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Exam6 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("선풍기", "10"); 
		map.put("에어컨", "100");
		map.put("건조기", "100");
		map.put("선풍기", "1000"); 
		
		Iterator<String> itk = map.keySet().iterator();
		while(itk.hasNext()) {
			String key = itk.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println();
		for(String k : map.keySet()) {
			System.out.println(k + " : " + map.get(k));
		}
		
		System.out.println();
		Iterator<String> itv = map.values().iterator();
		while(itv.hasNext()) {
			String value = itv.next();
			System.out.println(value);
		}
		
		System.out.println();
		for(String v : map.values()) {
			System.out.println(v);
		}
		
	}
}





