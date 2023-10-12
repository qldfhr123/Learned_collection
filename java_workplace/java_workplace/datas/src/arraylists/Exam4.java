package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <String>list = new ArrayList();
		String data1 = "김변수";
		String data2 = "이변수";
		String data3 = "박변수";
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		
		System.out.println("리스트에 저장된 데이터의 수 : "+list.size());
		System.out.println("남겨져 있는데이터 수 : "+list);
		System.out.println("중복검사 실시 데이터 입력 ");
		String tmp = sc.next();
		
		int index = list.indexOf(tmp);//index필요하는 기능을 바로 사용할수있다
		if(index!=-1) {
			System.out.println(tmp+"가 존재합니다");
		}
		else
			System.out.println(tmp+"가 존재하지않습니다");

	}

}

