package disassemble.Service;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class ChangePasswordService {
	private MemberDAO memberDao;
	
	public ChangePasswordService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}

	public void changePassword(String email, String oldPw, String newPw) {
		// 이메일 등록여부 확인.
		MemberDTO member = memberDao.selectEmail(email);
		
		if(member != null) {
			// 패스워드 확인 및 MemberDAO.update() 호출
			if(member.getPassword().equals(oldPw)) {
				member.setPassword(newPw);
				member.setEmail(email);
				memberDao.update(member);
				System.out.println("비밀번호가 변경되었습니다.");
			}else {
				System.out.println("현재 비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println("등록된 정보가 없습니다.");
		}
	}

}













