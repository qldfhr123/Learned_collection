package inheritance7;

import java.util.ArrayList;



public class MemberDaoImpl implements IMemberDAO{
	private ArrayList<MemberDTO> members;
	
	public MemberDaoImpl() {
		members = new ArrayList<>();
	}

	@Override
	public void insert(MemberDTO member) {
		members.add(member);
	}

	@Override
	public int findIndexByEmail(String email) {
		// 이메일 인덱스 찾기
		for(MemberDTO member : members) {
			if(member.getEmail().equals(email)) {
				return members.indexOf(member);
			}
		}
		return -1;
	}

	@Override
	public MemberDTO selectEmail(int index) {
		
		return members.get(index); //인덱스에 데이터가 있다면 반환
		
	}

	@Override
	public ArrayList<MemberDTO> selectAll() {
		
		return members; //참조값이 리스트가 가지고있다
	}

	@Override
	public void update(int index, String name, String mobile) {
		
		MemberDTO member = members.get(index); //다시 데이터 가져온다
		
		member.setName(name);
		member.setMobile(mobile);
		
		members.set(index, member);
	}

	@Override
	public void delete(int index) {
		
		members.remove(index);
		
	}

	
	
}










