package arraylists;

import java.util.Scanner;
import java.util.ArrayList;

public class Exam7 {

	public static void main(String[] args) {
		ArrayList <String>list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		String data1 = "김변수";
		String data2 = "이변수";
		String data3 = "박변수";
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		list.add("최변수");
		System.out.print("삭제 데이터 입력(데이터 삭제 : )");
		String tmp = sc.next();
		
		System.out.println("list.remove(tmp)"+list.remove(tmp));
		System.out.println("담겨 있는 모든 데이터"+list);
		
		System.out.println("삭제 데이터 입력(인덱스 삭제)");
		tmp = sc.next();
		int index = list.indexOf(tmp);
		if(index!=-1) 
			System.out.println("list.remove(tmp)"+list.remove(index));
			
		System.out.println("담겨 있는 모든 데이터"+list);
		
		

	}

}
