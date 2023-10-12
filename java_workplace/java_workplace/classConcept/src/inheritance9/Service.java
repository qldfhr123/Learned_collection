package inheritance9;

import java.util.ArrayList;
import java.util.Scanner;


public class Service {
	Scanner sc = new Scanner(System.in);
	
	private DAO dao;
	private DTO dto;
	private int index;
	
	public Service() {
		dao = new DAO();
	}
	
	
	
	public void selectId(String id) {
		index = dao.findIndex(id);
		if(index !=-1) {
			DTO dto = new DTO();
			dto = dao.selectId(index);
			System.out.println();
			System.out.println("아이디 : "+dto.getId());
			System.out.println("비밀번호 : "+dto.getPassword());
			System.out.println("이름 : "+dto.getName());
		}
		else {
			System.out.println();
		}
	}
	
	public void selectAll() {
		ArrayList<DTO> list = dao.selectAll();
		if(list.isEmpty()==false) {
			for(int i = 0; i<list.size();i++) {
				DTO dto = new DTO();
				dto = list.get(i);
				System.out.println("=== 회원 목록 ===");
				System.out.println("아이디 : "+dto.getId());
				System.out.println("비밀번호 : "+dto.getPassword());
				System.out.println("이름 : "+dto.getName());
			}

		}
		else {
			System.out.println("등록된정보가없습니다");
		}
	}
	
	
}
