package maps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;
import java.util.Scanner;


public class Quiz1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String menu;
		Integer price;
		while (true) {
			System.out.println("1.메뉴 등록 \n2.메뉴별 가격보기 \n3.종료");
			System.out.print(">> ");
			
			int select;
			try {
				select = Integer.parseInt(sc.next());
			} catch (Exception e) {
				continue;
			}

			if (select == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch (select) {
			case 1:	System.out.println("등록하실 메뉴를 작성해주세요!");
					menu=sc.next();
					if(map.containsKey(menu)==true) {
						System.out.println("등록이 되어있는 메뉴입니다!");
						continue;
					}
					System.out.println("메뉴의 가격을 등록해주세요!");
					price=sc.nextInt();
					map.put(menu,price);
					System.out.println("메뉴의 등록을 완료했습니다");
					break;
			case 2:	Iterator<String> menu_name = map.keySet().iterator();
					if(menu_name.hasNext()==true) {
						while(menu_name.hasNext()) {
							menu = (String)menu_name.next();
							System.out.println(menu+" : "+map.get(menu)+"원");
							}
						}
					else {
						System.out.println("등록한 메뉴가 없습니다");
						continue;
					}
					System.out.println();
						System.out.println("**********************");
						System.out.println("1.수정  2.삭제  3.나가기");
						System.out.print(">>> ");
						int select2;
						try {
							select2 = Integer.parseInt(sc.next());
						} catch (Exception e) {
							continue;
						}
						if (select == 3) {
							System.out.println("수정을 종료합니다");
							break;
						}
						switch (select2) {
						case 1:
							System.out.println("현재 등록 되어있는 메뉴는 "+map.keySet()+"입니다.");
							System.out.print("수정하실 메뉴 입력 : ");
							menu = sc.next();
							if(map.containsKey(menu)==false) {
								System.out.println("해당 메뉴가 존재하지않습니다");
								continue;
							}//메뉴명은 키값에 들어가있는데 변경하기위해서는 반복문에서 데이터가 있으면 기존걸 지우고 재작성 시키도록 한다
							else {
									System.out.print("수정할 가격 입력 : ");
									price = sc.nextInt();
									map.replace(menu, price); //replace:존재유무 확인 put:등록유무
									System.out.println("수정되었습니다.");
									continue;
							}
								
							
						case 2:
							System.out.print("삭제하실 메뉴를 입력 : ");
							menu = sc.next();
							if(map.containsKey(menu)==false) {
								System.out.println("해당 메뉴는 존재하지않습니다");
							}else {
								map.remove(menu);
								System.out.println("메뉴가 삭제되었습니다.");
								continue;
							}
						default:
							System.out.println("이전으로 돌아갑니다.");
							continue;
							}//2번째 switch
					default :System.out.println("확인 후 다시 입력하세요.");
						
					}//1번째 switch
		
				}

	}
}
