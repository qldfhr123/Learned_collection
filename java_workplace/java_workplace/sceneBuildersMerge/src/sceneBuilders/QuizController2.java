package sceneBuilders;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class QuizController2 implements Initializable{
	// 어노테이션
	@FXML TextField idField;
	@FXML PasswordField pwField;

	private MemberDAO memberDao;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		memberDao = new MemberDAO();
	}
	
	// TextField 이벤트 메서드(onKeyPressed)
	public void idCheck() {
		if(idField.getText().length() >= 10) {
			message("최대 길이는 10자리입니다.");
			idField.setText(idField.getText().substring(0, 10));
		}
	}
	
	// PasswordField 이벤트 메서드(onKeyReleased)
	public void pwCheck() {
		if(pwField.getText().length() > 10) {
			message("최대 길이는 10자리입니다.");
			pwField.setText(pwField.getText().substring(0, 10));
		}
	}
	public void message(String contentText) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("알림");
		alert.setContentText(contentText);
		alert.show();
	}
	
	// 로그인 버튼이 클릭되면 동작함.
	public void loginButtonMethod() {
		String userId = idField.getText();
		String userPw = pwField.getText();
		
		String dbPw = memberDao.login(userId);
		
		if(userId.isEmpty()) {
			message("아이디를 입력하세요.");
		}else if(userPw.isEmpty()) {
			message("비밀번호를 입력하세요.");
		}else if(dbPw != null && dbPw.equals(userPw) ) {
			message("로그인 성공");
		}else {
			message("로그인 실패");
		}
		
	}
	
}





