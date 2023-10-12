package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		ArrayList <String>name_list = new ArrayList();
		ArrayList <String>tell_list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		String name;
		String tell;
		
		while (true) {
			System.out.println("1.연락처 등록 \n2.연락처 검색 \n3.연락체 삭제 \n4.모두 보기\n5.종료");
			System.out.print(">> ");
			
			int select;
			try {
				select = Integer.parseInt(sc.next());
			} catch (Exception e) {
				continue;
			}

			if (select == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch (select) {
			case 1: System.out.println("이름과 연락처를 등록합니다");
					System.out.print("이름 : ");
					name = sc.next();
					if (name_list.indexOf(name) == -1) {
						name_list.add(name);
					System.out.println("등록하고자 하는 번호를 입력하세요");
					System.out.print("번호 : ");
					tell = sc.next();
					tell_list.add(tell);
					System.out.println("등록이 완료되었습니다!");
					System.out.println("등록하신 이름은 : " + name + " / 번호는 : " + tell + " 입니다.");
					} 
					else {
					System.out.println("중복된 이름이 있습니다. 다시 확인해 주세요.");
					}break;
														
			case 2: System.out.println("연락처를 검색합니다 이름을 입력해주세요");
					System.out.print("이름 : ");
					name = sc.next();
					if (name_list.indexOf(name) == -1) {
						System.out.println("등록되어 있지 않은 이름입니다.");
					} else {
						System.out.println("검색하신 이름 : " + name + "님 의 연락처는 " + tell_list.get(name_list.indexOf(name)) + "입니다.");
					}
					break;
			
			case 3:	if (name_list.isEmpty() == true) { 
					System.out.println("목록에 없습니다.");
					} else {
						System.out.println("누구의 연락처를 삭제 하시겠습니까?");
						
						for (int i = 0; i < name_list.size(); i++) {
							name = (String) name_list.get(i);
							System.out.println(name);
						}
						System.out.println("삭제하실 이름을 입력하세요.");
						name = sc.next();
						if (name_list.remove(name) == true) {
							System.out.println("삭제되었습니다.");
						}
					}
					break;
			
			case 4:	System.out.println("저장되어있는 정보를 모두 불러옵니다");
					for (int i = 0; i < name_list.size(); i++) {
						System.out.println("이름 : " + name_list.get(i) + " / 번호 : " + tell_list.get(i));
					}
					if (name_list.size() == 0) {
						System.out.println("등록되지 않는 정보입니다 \n 정보를 먼저 등록하세요");
					}
					break;
			default :System.out.println("확인 후 다시 입력하세요.");
			}
		}

	}

}
