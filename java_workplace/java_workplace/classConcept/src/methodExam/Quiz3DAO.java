package methodExam;

import java.util.ArrayList;
import java.util.HashMap;

public class Quiz3DAO {
	HashMap<String, Quiz3DTO> members = new HashMap<>();
	
	public void put(Quiz3DTO quizDto) {
	
		members.put(quizDto.getId(),quizDto);
	}
	

	public Quiz3DTO get(String id) {
		Quiz3DTO dto = members.get(id);
		return dto;
		  
	}

	public ArrayList<Quiz3DTO> values() {
		ArrayList<Quiz3DTO>list = new ArrayList<>(members.values());
		return list;
	}
	
	public void remove(String id) {
		members.remove(id);
	}
	
	public void update(Quiz3DTO quizDto) {
		members.put(quizDto.getId(), quizDto);
	}
	
	
	
	
}
