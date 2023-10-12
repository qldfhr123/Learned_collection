package maps;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Exam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("선풍기",10); 
		map.put("에어컨",100);
		map.put("건조기",100);
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		//리스트에 담아서
		ArrayList<String> keys = new ArrayList<>(map.keySet());
		ArrayList<Integer> vals = new ArrayList<>(map.values());
		System.out.println(keys);
		System.out.println(vals);
		
	}

}
