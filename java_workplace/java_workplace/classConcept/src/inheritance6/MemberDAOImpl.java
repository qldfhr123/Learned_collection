package inheritance6;

import java.util.ArrayList;

public class MemberDAOImpl implements IMemberDAO{
	private ArrayList<String> emails;
	private ArrayList<String> names;
	private ArrayList<String> mobiles;
	
	public MemberDAOImpl() {
		emails = new ArrayList<>();
		names = new ArrayList<>();
		mobiles = new ArrayList<>();
	}

	@Override
	public void insert(String email, String name, String mobile) {
		if(emails.contains(email) == false){
			emails.add(email);
			names.add(name);
			mobiles.add(mobile);
			System.out.println(email+"등록되었습니다");
		}
		else {
			System.out.println("이미 등록된 정보입니다");
		}
		
	}

	@Override
	public void selectEmail(String email) {
		int index_e = emails.indexOf(email);
		if(index_e !=-1) {
			emails.get(index_e);
			names.get(index_e);
			mobiles.get(index_e);
		}
		else {
			System.out.println("등록된 정보가  아닙니다");
		}
	}

	@Override
	public void selectAll() {
		if(emails.isEmpty() == false){
		for(int i = 0; i < emails.size(); i++) {
			System.out.println("이메일 : "+emails.get(i));
			System.out.println("이름 : "+names.get(i));
			System.out.println("전화번호 : "+mobiles.get(i));
			}
		}
		else {
			System.out.println("등록후 이용");	
		}
	}

	@Override
	public void delete(String email) {
		int index_e = emails.indexOf(email);
		if(index_e !=-1) {
		emails.remove(index_e);
		names.remove(index_e);
		mobiles.remove(index_e);
		System.out.println(email+"삭제되었습니다");
		}
		else {
			System.out.println("등록된 정보가  아닙니다");
		}
		
	}

	@Override
	public void update(String email, String name, String mobile) {
		
		int index_e = emails.indexOf(email);
		if(index_e !=-1) {
			names.set(index_e, name);
			mobiles.set(index_e, mobile);
		}
		else {
			System.out.println("등록된 정보가  아닙니다");
		}
	}
	
	
}
