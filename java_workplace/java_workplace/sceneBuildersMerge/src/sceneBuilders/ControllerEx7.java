package sceneBuilders;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ControllerEx7 implements Initializable {
	// 조건은 참조변수의 이름은 fx:id랑 동일하다.
	@FXML private Button loginButton;
	@FXML private TextField id;
	@FXML private PasswordField pw;
	private MemberDAO memberDao;
	/*
	 @FXML 어노테이션을 사용하여 아래 코드를 대체할 수 있다.
		Button loginButton = (Button) form.lookup("#loginButton");
		TextField idFld = (TextField) form.lookup("#id");
		PasswordField pwFld = (PasswordField) form.lookup("#pw");
	 */
	public void loginProc() {
		String dbPw = memberDao.login(id.getText());
		Alert alert = new Alert(AlertType.INFORMATION);
		if (dbPw != null && dbPw.equals(pw.getText())) {
			alert.setContentText("로그인 성공");
		} else {
			alert.setContentText("로그인 실패");
		}
		alert.show();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("ControllerEx7 안에 initialize Method 호출");
		memberDao = new MemberDAO();
	}
	
	public void regProc() {
		
	}

}












