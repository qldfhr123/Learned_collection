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

public class QuizController implements Initializable{
	// 어노테이션
	@FXML private TextField idField;
	@FXML private PasswordField pwField;
	private MemberDAO memberDao;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		memberDao = new MemberDAO();
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





