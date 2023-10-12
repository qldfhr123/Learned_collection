package sceneBuilders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Ex6 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ex6.fxml"));
		Parent form = loader.load();
		
		/*
		 *  DB에 Table 수정하기
		 *  이름 : scene
		 *  컬럼 : 이름(name), 성별(gender), 
		 *  컬럼 : 연령대(ageScope), 취미(hobbys)
		 *  
			ALTER TABLE scene ADD name varchar2(21);
			ALTER TABLE scene ADD gender varchar2(6);
			ALTER TABLE scene ADD age_scope varchar2(6);
			ALTER TABLE scene ADD hobbys varchar2(100);
			COMMIT;

		 *  위 테이블에 ALTER TABLE 명령을 사용하여
		 *  컬럼을 추가하기.
		 */
		
		ComboBox<String> ageCombo = (ComboBox<String>)form.lookup("#ageCombo");
		ageCombo.getItems().addAll("10대", "20대", "30대", "40대");
		
		Button regButton = (Button)form.lookup("#regButton");
		regButton.setOnMouseClicked(e->{
			PasswordField pwFld = (PasswordField)form.lookup("#pw");
			PasswordField confirmFld = (PasswordField)form.lookup("#confirm");
			Alert alert = new Alert(AlertType.INFORMATION);
			
			if(pwFld.getText().equals(confirmFld.getText())) {
				TextField idFld = (TextField)form.lookup("#id");
				if(idFld.getText().isEmpty() == false) {
					TextField nameFld = (TextField)form.lookup("#name");
					RadioButton womanRadio = (RadioButton)form.lookup("#womanRadio");
					RadioButton manRadio = (RadioButton)form.lookup("#manRadio");
					
					String gender = "";
					if(womanRadio.isSelected())
						gender = womanRadio.getText();
					else if(manRadio.isSelected())
						gender = manRadio.getText();
					
					CheckBox musicCheck = (CheckBox)form.lookup("#musicCheck");
					CheckBox sportCheck = (CheckBox)form.lookup("#sportCheck");
					CheckBox movieCheck = (CheckBox)form.lookup("#movieCheck");
					String hobbys = "";
					if(musicCheck.isSelected())
						hobbys += musicCheck.getText()+" ";
					
					if(sportCheck.isSelected())
						hobbys += sportCheck.getText()+" ";
					
					if(movieCheck.isSelected())
						hobbys += movieCheck.getText();
					
					MemberDAO member = new MemberDAO();
					member.insert(idFld.getText(), pwFld.getText(), nameFld.getText(), 
							gender, ageCombo.getValue(), hobbys);
				}else {
					alert.setContentText("아이디를 입력하고 다시 시도하세요.");
				}
			}else {
				alert.setContentText("비밀번호를 확인 후 다시 입력하세요.");
			}
			alert.show();
		});
	
		
		
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("ex6");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}








