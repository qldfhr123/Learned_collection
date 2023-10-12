package methodExam;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz4 {
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
		 */
		
		String id = "", password = "", name = "";
		
		QuizDAO4 quizDao = new QuizDAO4();
		QuizDTO4 dto;
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
				//입력받은 id를 indexOf매서드에 담아주고 그걸 인덱스라 정한다
				index = quizDao.indexOf(id);
				
				if(index == -1) { //indexOf -1 : 같은것을 찾지못했을떄 실행하겠다
					System.out.print("비밀번호 : "); password = sc.next();
					System.out.print("이름 : "); name = sc.next();
					
					dto = new QuizDTO4();//dto 다시 지정해주고
					
					//다시담아주고
					dto.setId(id);
					dto.setPassword(password);
					dto.setName(name);
					//담은 데이터를 add매서드에 주겠다
					quizDao.add(dto);
				
					System.out.println(id + " 계정 등록 완료");
				}else {
					System.out.println("등록된 아이디입니다.");
				}
				break;
			case "2": 
				System.out.print("아이디 : "); id = sc.next();
				index = quizDao.indexOf(id);
				
				if(index == -1) {
					System.out.println("등록되지 않은 아이디입니다.");
				}else {
					dto = quizDao.get(index);
					
					System.out.println("## 회원 검색 결과 ##");
					System.out.println("아이디 : " + dto.getId());
					System.out.println("비밀번호 : " + dto.getPassword());
					System.out.println("이름 : " + dto.getName());
				}
				System.out.println();
				break;
			case "3": 
				System.out.print("아이디 : "); id = sc.next();
				index = quizDao.indexOf(id);
				
				if(index == -1) {
					System.out.println("등록되지 않은 아이디입니다.");
				}else {
					
					quizDao.remove(index);
					System.out.println(id + " 계정 정보 삭제 완료");
				}
				System.out.println();
				break;
			case "4": 
				ArrayList<QuizDTO4> list = quizDao.getAll();
				
				if(list.isEmpty()) {
					System.out.println("등록 후 이용하세요.");
				}else {
					for(QuizDTO4 quizDto : list) {
						System.out.println("아이디 : " + quizDto.getId());
						System.out.println("비밀번호 : " + quizDto.getPassword());
						System.out.println("이름 : " + quizDto.getName());
						System.out.println();
					}
				}
				break;
			case "5": 
				System.out.print("아이디 : "); id = sc.next();
				index = quizDao.indexOf(id);
				
				if(index == -1) {
					System.out.println("등록되지 않은 아이디입니다.");
				}else {
					dto = quizDao.get(index);
					
					System.out.print("현재 비밀번호 : "); password = sc.next();
					if(dto.getPassword().equals(password)) {
						System.out.print("새로운 비밀번호 : ");
						dto.setPassword(sc.next());
						quizDao.set(dto);
						System.out.println("비밀번호가 수정되었습니다.");
					}else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
				}
				System.out.println();
				break;
			case "6" : System.out.println("프로그램을 종료합니다."); System.exit(0);
			default : System.out.println("메뉴를 확인하세요.");
			}
		}
	}
}
