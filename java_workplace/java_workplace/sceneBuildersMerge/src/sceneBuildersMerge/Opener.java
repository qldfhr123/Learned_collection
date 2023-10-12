package sceneBuildersMerge;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class Opener {
	private Stage primaryStage;
	private Stage regStage;
	private Parent regForm;
	
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	
	// 메인 화면을 실행하는 기능
	public void mainOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("menuForm.fxml"));
		
		Parent menuForm;
		try {
			menuForm = loader.load();
			primaryStage.setScene(new Scene(menuForm));
			primaryStage.setTitle("메인 화면");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 회원가입 화면을 실행하는 기능
	public void regOpen() {
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("regForm.fxml"));
		
		regStage = new Stage();
		try {
			regForm = loader.load();
			RegController regCon = loader.getController();
			regCon.setRegStage(regStage);
			regCon.setRegForm(regForm);
			
			ComboBox<String> ageCombo = (ComboBox<String>) regForm.lookup("#ageCombo");
			ageCombo.getItems().addAll("10대", "20대", "30대", "40대");
			
			regStage.setScene(new Scene(regForm));
			regStage.setTitle("회원가입 화면");
			regStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}





