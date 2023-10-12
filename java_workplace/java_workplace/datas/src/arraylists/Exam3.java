package arraylists;

import java.util.ArrayList;

public class Exam3 {

	public static void main(String[] args) {
		ArrayList <Integer>list = new ArrayList<Integer>();
		Integer data1 = 10;
		Integer data2 = 20;
		int data5 = 100;
		
		
		double data3 = 1.1;
		double data4 = 2.2;
		
		list.add(10);
		list.add(data2);
		list.add(data5);
		System.out.println("리스트에 저장된 데이터의 수 : "+list.size());
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(int i:list) {
			System.out.println(i);
		}


	}

}
