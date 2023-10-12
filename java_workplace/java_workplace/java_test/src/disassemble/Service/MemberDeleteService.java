package disassemble.Service;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;


public class MemberDeleteService {
	
	private MemberDAO memberDao;
	
	
	
	public MemberDeleteService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void checkPassword(String email, String password, String confirmPassword) {
		// 패스워드 확인
		if(password.equals(confirmPassword) == false) {
			System.out.println("암호가 일치하지 않습니다.");
			return;
		}
		// MemberDAO 객체 내 selectEmail() 메소드를 호출
				MemberDTO check = memberDao.selectEmail(email);
				
				// 저장된 회원 정보와 입력된 회원 정보 검증
				if(check != null) {
					// 패스워드 확인 및 MemberDAO.update() 호출
					if(check.getPassword().equals(password) == true) {
						// MemberDAO 객체 내 delete() 호출
						memberDao.delete(email);
						System.out.println("회원 정보가 삭제되었습니다.");
					}else {
						System.out.println("현재 비밀번호가 일치하지 않습니다.");
					}
				}else {
					System.out.println("등록된 정보가 없습니다.");
				}
				
			}
	
}
