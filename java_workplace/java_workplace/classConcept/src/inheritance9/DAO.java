package inheritance9;

import java.util.ArrayList;


public class DAO {
	
	private  ArrayList<DTO> list;
	private int index;
	DTO dto = new DTO();
	DAO dao;
	
	public DAO() {
		list = new ArrayList<>();
	}
	public void select(String id) {
	}	
	
	public void insert(String id, String password, String name) {
		
		index = dao.findIndex(id);
		if(index != -1) {
			dto.setId(id);
			dto.setPassword(password);
			dto.setName(name);
			list.add(dto);
			System.out.println(id + " 계정 등록 완료");
		}else {
			System.out.println("등록된 아이디입니다.");
		}
		
	}
	
	public int findIndex(String id) {
		// 이메일 인덱스 찾기
		for(DTO dto : list) {
			if(dto.getId().equals(id)) {
				return list.indexOf(dto);
			}
		}
		return -1;
	}
	
	public void update( String id, String password) {
		

		DTO dto = list.get(index); //다시 데이터 가져온다
		
		dto.setPassword(password);
		list.set(index, dto);
		
	}
	
	public DTO selectId(int index) {
		
		return list.get(index); //인덱스에 데이터가 있다면 반환
		
	}
	public ArrayList<DTO> selectAll() {
		
		return list; //참조값이 리스트가 가지고있다
	}
	
	public void delete(String id) {
		index = dao.findIndex(id);
		if(index != -1) {
			list.remove(index);
			System.out.println(id+"의 정보는 삭제되었습니다");
		}
		else {
			System.out.println(id+"의 정보가 없습니다");
		}
	}
	
}
