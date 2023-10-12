package disassemble.Service;

import java.util.Collection;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class MemberAllService {
	
	private MemberDAO memberDao;
	
	public MemberAllService(MemberDAO memberDao){
		this.memberDao = memberDao;
	}
	
	public void selectAll() {
		// MemberDAO 객체 내부 selectAll() 호출 후 회원 모든 정보 출력
		Collection<MemberDTO> members = memberDao.selectAll();
		
		if(members.isEmpty()) {
			System.out.println("등록 후 이용하세요.");
		}else {
			for(MemberDTO m : members) {
				System.out.println("이메일 : " + m.getEmail());
				System.out.println("이름 : " + m.getName());
				System.out.println("비밀번호 : " + m.getPassword());
				System.out.println("가입일 : " + m.getRegisterDate());
				System.out.println("==========================");
			}
		}
	}

}












