package methodExam;

import java.util.HashMap;
import java.util.ArrayList;

public class Member {
	// 아래 HashMap에 데이터 관리의 코드는 Member Class에 작성
	// 데이터 관리 코드 : Create(입력), Read(검색,조회), Update(수정), Delete(삭제)
	
	private HashMap<String, String> passwords = new HashMap<>();
	private HashMap<String, String> names = new HashMap<>();
	
	public void insert(String id, String password,String name) {
		passwords.put(id,password);
		names.put(id,name);
		
	}
	
	public MemberDTO select(String id) {
		String p = passwords.get(id);
		String n = names.get(id);
		if(p == null)
			return null;
		
		MemberDTO memberDto = new MemberDTO();
		memberDto.setPassword(p);
		memberDto.setName(n);
		return memberDto;
		
		/*		
		 * 	return p, n;
		 * 두 개 이상의 반환데이터
		 *  - 같은 자료형일 경우 배열, Collection 또는 DTO와 같은 클래스
		 *  - 다른 자료형일 경우 Collection 또는 DTO와 같은 클래스
		 */
	}
	
	public ArrayList<MemberDTO> selectAll() { //여려명의 데이터를 하나로 묶기 위해
		 ArrayList<MemberDTO>members = new ArrayList<>();
		 
		 for(String id : passwords.keySet()) {
			 MemberDTO dto = new MemberDTO();
			 dto.setId(id);
			 dto.setPassword(passwords.get(id));
			 dto.setName(names.get(id));
			 members.add(dto);
		 }
			 
			 return members;
	}
	
	public void update(String id, String password) {
		passwords.put(id,password);
	}
	/*public void update(MemberDTO memberDto) {
		passwords.put(memberDto.get(id),memberDto.getPassword());
	}*/
	
	public void delete(String id) {
		names.remove(id);
		passwords.remove(id);
	}
}








