package sceneBuilders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Ex4 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ex4.fxml"));
		Parent form = loader.load();
		
		Button reg = (Button)form.lookup("#reg");
		reg.setOnMouseClicked(e->{
			TextField idFld = (TextField)form.lookup("#id");
			PasswordField pwFld = (PasswordField)form.lookup("#pw");
			RadioButton wRb = (RadioButton)form.lookup("#w");
			RadioButton mRb = (RadioButton)form.lookup("#m");
			CheckBox gameBox = (CheckBox)form.lookup("#game");
			CheckBox studyBox = (CheckBox)form.lookup("#study");
			TextArea sayText = (TextArea)form.lookup("#say");
				
			System.out.println("아이디 : " + idFld.getText());
			System.out.println("비밀번호 : " + pwFld.getText());
			
			System.out.println("남자 : " + mRb.isSelected());
			System.out.println("남자 : " + mRb.getText());
			System.out.println("여자 : " + wRb.isSelected());
			System.out.println("남자 : " + wRb.getText());
			
			System.out.println("게임 : " + gameBox.isSelected());
			System.out.println("게임 : " + gameBox.getText());
			System.out.println("공부 : " + studyBox.isSelected());
			System.out.println("공부 : " + studyBox.getText());
			
			System.out.println("하고 싶은 말 : " + sayText.getText());
			
			String id, pw, gender, hobbys;
			
			id = idFld.getText();
			pw = pwFld.getText();
			
			if(mRb.isSelected())
				gender = mRb.getText();
			else
				gender = wRb.getText();
			
			hobbys = "";
			if(gameBox.isSelected())
				hobbys += gameBox.getText();
			
			if(studyBox.isSelected())
				hobbys += studyBox.getText();
			
			String say = sayText.getText();
		});
	
		
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("ex4");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}








