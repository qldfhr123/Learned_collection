package inheritance99;

import java.util.ArrayList;

public class DAO {
	private ArrayList<DTO> list;
	
	public DAO() {
		list = new ArrayList<>();
	}
	
	public void add(DTO dto) {
		list.add(dto);
	}
	
	public int indexOf(String id) {
		for(DTO dto : list) {
			if(dto.getId().equals(id))
				return list.indexOf(dto);
		}
		return -1;
	}
	
	public DTO get(int index) {
		return list.get(index);
	}
	
	public void remove(int index) {
		list.remove(index);
	}
	
	public void set(int index, DTO dto) {
		list.set(index, dto);
	}
	
	public ArrayList<DTO> getAll() {
		return list;
	}
}
