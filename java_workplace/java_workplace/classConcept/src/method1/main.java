package method1;

import java.util.ArrayList;
import method2.Sub2;

public class main {

	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<>();
		Sub sub = new Sub();
		Sub2 sub2 = new Sub2();
		method3.Sub3 sub3 = new method3.Sub3();

		list.add("데이터 입력");
		
		list.get(0);
		
		//매서드에 입력하는 값은 0개이상
		list.isEmpty();
		list.add(0,"데이터");
		int index = list.indexOf("데이터");
		
		//매서드는 반환 데이터 (Return Value)가 있을수있다
		String data = "김 변 수";
		data.equals("이변수");
		data.split(" ");
		
		
		list.clear();//반환 데이터는 없는것도 있다
		
		sub.printMethod();//매서드 이름을 호출해야한다
		sub.printMethod2("문자열");
		System.out.println("반환데이터: "+sub.add(1,2));
		int total = sub.add(3,5);
		System.out.println("반환데이터: "+total);
				
		
		sub.printMethod();
		int result = sub2.add(10, 20);
		System.out.println("10 + 20 = 반환데이터: "+result);
		result = sub2.add(10, 20);
		System.out.println("10 - 20 = 반환데이터: "+result);
		
		
		
	}

}
