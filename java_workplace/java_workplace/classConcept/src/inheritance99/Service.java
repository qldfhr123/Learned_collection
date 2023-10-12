 package inheritance99;

import java.util.ArrayList;

public class Service {
	private DAO dao;
	
	public Service() {
		dao = new DAO();
	}
	
	public void add(String id, String password, String name) {
		int index = dao.indexOf(id);
		
		if(index == -1) {
			DTO dto = new DTO();
			dto.setId(id);
			dto.setPassword(password);
			dto.setName(name);
			
			dao.add(dto);
			
			System.out.println(id + " 계정 등록 완료");
		}else {
			System.out.println("등록된 아이디입니다.");
		}
	}
	
	public void get(String id) {
		int index = dao.indexOf(id);
		
		if(index == -1) {
			System.out.println("등록되지 않은 아이디입니다.");
		}else {
			DTO dto = dao.get(index);
			System.out.println("## 회원 검색 결과 ##");
			System.out.println("아이디 : " + dto.getId());
			System.out.println("비밀번호 : " + dto.getPassword());
			System.out.println("이름 : " + dto.getName());
		}
		System.out.println();
	}
	
	public void remove(String id) { //인덱스를 구분하는곳 구한 값을 dao 에게 전달
		int index = dao.indexOf(id);
		if(index == -1) {
			System.out.println("등록되지 않은 아이디입니다.");
		}else {
			dao.remove(index);
			System.out.println(id + " 계정 정보 삭제 완료");
		}
		System.out.println();
	}
	
	public void getAll() {
		ArrayList<DTO> list = dao.getAll();
		
		if(list.isEmpty()) {
			System.out.println("등록 후 이용하세요.");
		}else {
			for(DTO dto : list) {
				System.out.println("아이디 : " + dto.getId());
				System.out.println("비밀번호 : " + dto.getPassword());
				System.out.println("이름 : " + dto.getName());
				System.out.println();
			}
		}
	}
	public void set(String id, String currentPassword, String changePassword) {
		int index = dao.indexOf(id);
		if(index == -1) {
			System.out.println("등록되지 않은 아이디입니다.");
		}else {
			DTO dto = dao.get(index);
			if(dto.getPassword().equals(currentPassword)) {
				dto.setPassword(changePassword);
				dao.set(index, dto);
				System.out.println("비밀번호가 수정되었습니다.");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		System.out.println();
	}
}
