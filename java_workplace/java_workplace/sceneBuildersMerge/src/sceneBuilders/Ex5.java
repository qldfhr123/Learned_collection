package sceneBuilders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Ex5 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		FXMLLoader loader = new FXMLLoader(getClass().getResource("loginForm.fxml"));
		Parent form = loader.load();
		
		/*
		 *  DB에 Table 생성하기
		 *  이름 : scene
		 *  컬럼 : 아이디(id), 비밀번호(pw)
		 *  primary key : 아이디
		 *  
		 *  위 테이블 생성 후 INSERT INTO 명령을 사용하여 회원 등록
		 *  
			CREATE TABLE scene(
			id varchar2(20),
			pw varchar2(20),
			PRIMARY KEY(id)
			);
			INSERT INTO scene VALUES('admin', '1234');
			INSERT INTO scene VALUES('user1', '1111');
			COMMIT;
			
		 *  loginForm에서 입력된 데이터를 scene 테이블에 저장된 회원과 비교하여
		 *  로그인 성공 또는 로그인 실패 출력하기.
		 */
		
		MemberDAO member = new MemberDAO();
		
		Button loginButton = (Button)form.lookup("#loginButton");
		loginButton.setOnMouseClicked(
			e->{
				TextField idFld = (TextField)form.lookup("#id");
				PasswordField pwFld = (PasswordField)form.lookup("#pw");
				
				String dbPw = member.login(idFld.getText());
				Alert alert = new Alert(AlertType.INFORMATION);
				if(dbPw != null && dbPw.equals(pwFld.getText()) ) {
					alert.setContentText("로그인 성공");
				}else {
					alert.setContentText("로그인 실패");
				}
				alert.show();
			}
		);
		
		
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("ex5");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}








