package inheritance7;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String email = "", name="", mobile="";
		int index;
		
		MemberDaoImpl memberDao = new MemberDaoImpl();
		MemberDTO dto = new MemberDTO();
		
		while (true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 회원 수정");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택 > ");
			int select;
			try {
				select = Integer.parseInt(in.next());
			} catch (Exception e) {
				continue;
			}
			switch (select) {
			case 1:
				System.out.println("=== 회원 등록 ===");
				System.out.print("이메일 : "); email = in.next();
				System.out.print("이름 : ");	name = in.next();
				System.out.print("전화번호 : "); mobile = in.next();
				index = memberDao.findIndexByEmail(email);
				
				if(index ==-1) {
					dto.setEmail(email);
					dto.setName(name);
					dto.setMobile(mobile);
					memberDao.insert(dto);
					System.out.println(email+"등록되었습니다");
				}
				
				else {
					System.out.println(email+"등록된 정보");
				}
				
				break;
			case 2:
				System.out.println("=== 회원 검색 ===");
				System.out.print("이메일 : "); email = in.next();
				
				index = memberDao.findIndexByEmail(email);
				if(index !=-1) {
					dto = memberDao.selectEmail(index);
					System.out.println();
					System.out.println("이메일 : "+dto.getEmail());
					System.out.println("이름 : "+dto.getName());
					System.out.println("전화번호 : "+dto.getMobile());
				}
				else {
					System.out.println(email+"은 등록되어있지않습니다");
				}
				break;
			case 3:
				System.out.println("=== 회원 삭제 ===");
				System.out.print("이메일 : "); email = in.next();
				
				index = memberDao.findIndexByEmail(email);
				if(index !=-1) {
					memberDao.delete(index);
					System.out.println(email+"삭제되었습니다");
				}
				else {
					System.out.println(email+"은 등록되어있지않습니다");
				}
				break;
			case 4: ArrayList<MemberDTO> members = memberDao.selectAll();
					if(members.isEmpty()==false) {
						for(int i = 0; i<members.size();i++) {
							dto = members.get(i);
							System.out.println("=== 회원 목록 ===");
							System.out.println("이메일 : "+dto.getEmail());
							System.out.println("이름 : "+dto.getName());
							System.out.println("전화번호 : "+dto.getMobile());
						}

					}
					else {
						System.out.println("등록된정보가없습니다");
					}
					break;
			case 5:
				System.out.println("=== 회원 수정 ===");
				System.out.print("이메일 : "); email = in.next();
				System.out.print("이름 : ");	name = in.next();
				System.out.print("전화번호 : "); mobile = in.next();
				
				index = memberDao.findIndexByEmail(email);
				if(index !=-1) {
					memberDao.update(index,name,mobile);
					System.out.println(email+"정보가 수정되었습니다");
				}
				else {
					System.out.println(email+"은 등록되어있지않습니다");
				}
				
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
		}
	}
	
	
}









