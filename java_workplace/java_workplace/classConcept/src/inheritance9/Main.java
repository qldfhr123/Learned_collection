package inheritance9;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * ArrayList를 사용하여 회원 정보 만들기.
		 * 1.회원등록 : id, password, name 3개의 정보를 등록함. 			
		 * 2.회원검색 : id로 회원 정보를 검색하여 출력함. 
		 * 3.회원삭제 : id로 회원 정보를 검색하여 삭제함. 
		 * 4.회원 모두 보기 : 모든 정보 출력함. 
		 * 5.비밀번호 수정 : id로 회원정보를 검색하여 비밀번호를 수정함. 
		 * 6.프로그램 종료 : 프로그램을 종료함.
		 * 
		 * 
		 * 
		 * Main class 입력
		 * Service Class : main dao 할일 빼고 전부
		 * dao class 데이터 저장소에 CRUD
		 */
		
		String id = "", password = "", name = "";
		Service service = new Service();
		DAO dao = new DAO();
		int index;
	
		while(true) {
			System.out.println("1. 회원등록");
			System.out.println("2. 회원검색");
			System.out.println("3. 회원삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 비밀번호 수정");
			System.out.println("6. 프로그램 종료");
			System.out.print(">> ");
			String select = sc.next();
			
			switch(select) {
			case "1": 
				System.out.print("아이디 : "); id = sc.next();
				System.out.print("비밀번호 : "); password = sc.next();
				System.out.print("이름 : "); name = sc.next();
				
				dao.insert(id, name, name);
				break;
			case "2": 
				System.out.print("아이디 : "); id = sc.next();
				service.selectId(id);
				break;
			case "3": 
				System.out.print("아이디 : "); id = sc.next();
				dao.delete(id);
				
				
				break;
			case "4": service.selectAll();
						break;
			case "5": 
				System.out.print("변경할 아이디아이디 : "); id = sc.next();
				index = dao.findIndex(id);
				if(index !=-1) {
					System.out.print("변경할 패스워드 : "); password = sc.next();
					dao.update(id,password);
				}
				
				
				
				break;
			case "6" : System.out.println("프로그램을 종료합니다."); System.exit(0);
			default : System.out.println("메뉴를 확인하세요.");
			}
		}
	}
}
