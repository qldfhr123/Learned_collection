package inheritance8;

import java.util.ArrayList;

public class MemberServiceImpl implements IMemberService{
	private MemberDaoImpl memberDao;
	private int index;
	
	public MemberServiceImpl() {
		memberDao = new MemberDaoImpl();
	}

	@Override
	public void insert(String email, String name, String mobile) {
		
		index = memberDao.findIndexByEmail(email);
		
		if(index ==-1) {
			MemberDTO member = new MemberDTO();
			member.setEmail(email);
			member.setName(name);
			member.setMobile(mobile);
			memberDao.insert(member);
			System.out.println(email+"등록되었습니다");
		}
		
		else {
			System.out.println(email+"등록된 정보");
		}
		
	}

	@Override
	public void selectEmail(String email) {
		index = memberDao.findIndexByEmail(email);
		if(index !=-1) {
			MemberDTO member = new MemberDTO();
			member = memberDao.selectEmail(index);
			System.out.println();
			System.out.println("이메일 : "+member.getEmail());
			System.out.println("이름 : "+member.getName());
			System.out.println("전화번호 : "+member.getMobile());
		}
		else {
			System.out.println(email+"은 등록되어있지않습니다");
		}
		
	}

	@Override
	public void selectAll() {
		ArrayList<MemberDTO> members = memberDao.selectAll();
		if(members.isEmpty()==false) {
			for(int i = 0; i<members.size();i++) {
				MemberDTO member = new MemberDTO();
				member = members.get(i);
				System.out.println("=== 회원 목록 ===");
				System.out.println("이메일 : "+member.getEmail());
				System.out.println("이름 : "+member.getName());
				System.out.println("전화번호 : "+member.getMobile());
			}

		}
		else {
			System.out.println("등록된정보가없습니다");
		}
		
	}

	@Override
	public void update(String email, String name, String mobile) {
		index = memberDao.findIndexByEmail(email);
		if(index !=-1) {
			
			memberDao.update(index,name,mobile);
			System.out.println(email+"정보가 수정되었습니다");
		}
		else {
			System.out.println(email+"은 등록되어있지않습니다");
		}
		
	}

	@Override
	public void delete(String email) {
		index = memberDao.findIndexByEmail(email);
		if(index !=-1) {
			memberDao.delete(index);
			System.out.println(email+"삭제되었습니다");
		}
		else {
			System.out.println(email+"은 등록되어있지않습니다");
		}
		
	}

}
