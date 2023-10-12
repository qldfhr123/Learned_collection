package methodExam;

import java.util.ArrayList;

public class QuizDAO4 {
	
	
	ArrayList<QuizDTO4> members = new ArrayList<>();
	
	public void add(QuizDTO4 quizDto) { 
		members.add(quizDto);
	}
	
	
	public int indexOf(String id) {
		for(QuizDTO4 qd : members) {
			if(qd.getId().equals(id)) {
				return members.indexOf(qd);
			}
		}
		return -1;
	}
	
	public QuizDTO4 get(int index) {
		return members.get(index);
	}
	
	public void remove(int index) {
		members.remove(index);
	}
	
	public void set(QuizDTO4 quizDto) {
		members.set(indexOf(quizDto.getId()), quizDto);
		// 아이디의 특정위치
	}
	
	public ArrayList<QuizDTO4> getAll() {
		return members;
	}
	
	
	
}
