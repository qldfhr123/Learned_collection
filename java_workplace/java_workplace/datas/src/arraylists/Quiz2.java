package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name_list = new ArrayList<>();
		ArrayList<String> tell_list = new ArrayList<>();
		ArrayList<String> mail_list = new ArrayList<>();
		String name;
		String tell;
		String mail;
		int index = 0;
		
		while (true) {
			System.out.println("1.연락처 등록 \n2.연락처 검색 \n3.연락체 삭제 \n4.모두 보기\n5.회원수정\n6.종료");
			System.out.print(">> ");
			
			int select;
			try {
				select = Integer.parseInt(sc.next());
			} catch (Exception e) {
				continue;
			}

			if (select == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			switch (select) {

			case 1:
				
				System.out.println("등록하고자 하는 이메일를 입력하세요.");
				System.out.print("E-mail : ");
				mail = sc.next();
				if (mail_list.indexOf(mail) == -1) {
					// 메일에 관해서 중복이 없다면 회원정보 입력
					// 메일 ArrayList에 추가
					mail_list.add(mail);
					System.out.println("이름을 입력해주세요.");
					System.out.print("이름 : ");
					name = sc.next();
					
					name_list.add(name);
					System.out.println("전화번호를 입력해주세요.");
					System.out.print("전화번호 : ");
					tell = sc.next();
					tell_list.add(name);
				
					System.out.println("\n등록이 완료되었습니다!");
					System.out.println("등록하신 이름은 : " + name + " / 번호는 : " + tell + " / E-mail은 : " + mail + "입니다.");
				} else {
					// 메일이 중복시에 출력
					System.out.println("중복된 메일입니다. 다시 확인해 주세요.");
				}
				break;

			case 2:
				// 목록을 검색할 수 있도록 메일 검색
				System.out.println("회원님 목록");
				for (int i = 0; i < mail_list.size(); i++) {
					System.out.println("E-mail : " + mail_list.get(i));
				}
				System.out.print("E-mail 검색 : ");
				mail = sc.next();
				if (mail_list.indexOf(mail) == -1) {

					System.out.println("등록되어 있지 않은 이름입니다.");

				} else {
					// 그게 아니면 정보출력
					System.out.println("검색하신 E-mail의 정보는 : " + mail + "이며, 이름은 " + name_list.get(mail_list.indexOf(mail)) + "의 연락처는 "
							+ tell_list.get(mail_list.indexOf(mail)) + "입니다.");
				}
				break;

			case 3:
				if (mail_list.isEmpty() == true) {
					System.out.println("목록에 없습니다.");
				} else {
					System.out.println("어느 분의 회원정보를 삭제 하시겠습니까?");

					for (int i = 0; i < mail_list.size(); i++) {
						mail = (String) mail_list.get(i);
						System.out.println(mail);
					}
					System.out.println("삭제하실 회원의 E-mail를 입력하세요.");
					System.out.print("검색 : ");
					mail = sc.next();

					if (mail_list.remove(mail) == true) {
						System.out.println("삭제되었습니다.");
					}
				}
				break;

			case 4:
				System.out.println("저장되어 있는 모든 회원정보를 불러옵니다.");
				for (int i = 0; i < mail_list.size(); i++) {
					System.out.println("이름 : " + name_list.get(i) + " / 번호 : " + tell_list.get(i) + " / E-mail : " + mail_list.get(i));
				}
				if (mail_list.size() == 0) {
					System.out.println("목록이 없습니다.");
					System.out.println("정보를 먼저 입력해주세요.");
				}
				break;

			case 5:
				if (mail_list.isEmpty() == true) {
					System.out.println("목록에 없습니다.");
				} else {
					System.out.println("어느 분의 회원정보를 수정 하시겠습니까?");

					for (int i = 0; i < mail_list.size(); i++) {
						mail = (String) mail_list.get(i);
						System.out.println(mail);
					}
					if (index != -1) {
						System.out.println("수정하실 회원의 E-mail를 입력하세요.");
						System.out.print("검색 : ");
						mail = sc.next();
						
						System.out.println("\n회원님의 이름을 수정해주세요.");
						System.out.print("이름 : ");
						String name2 = sc.next();
						System.out.println("\n회원님의 전화번호를 수정해주세요.");
						System.out.print("전화번호 : ");
						String tell2 = sc.next();

						name_list.set(index, name2);
						tell_list.set(index, tell2);

						System.out.println("\n수정되었습니다.");
						System.out.println("회원님의 이름 : " + name2 + " / 번호 : " + tell2 + "입니다.");
					}
				}
				break;
			
			default:
				System.out.println("메뉴 확인 후 다시 입력해 주세요.");
			}

	}

}
}
