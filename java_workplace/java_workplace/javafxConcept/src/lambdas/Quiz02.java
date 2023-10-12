package lambdas;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz02 extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		TextField idFld = new TextField();
		PasswordField pwFld = new PasswordField();
		
		VBox idPw = new VBox();
		idPw.getChildren().addAll(idFld, pwFld);
		idPw.setSpacing(5);
		idPw.setAlignment(Pos.CENTER);
		
		VBox login = new VBox();
		Button loginButton = new Button("로그인");
		loginButton.setPrefSize(70, 50);
		login.getChildren().add(loginButton);
		login.setAlignment(Pos.CENTER);
		
		HBox box = new HBox();
		box.getChildren().addAll(idPw, login);
		box.setSpacing(5);
		box.setAlignment(Pos.CENTER);
		
		loginButton.setOnMouseClicked(e->{
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("로그인");
			String id = idFld.getText();
			String pw = pwFld.getText();
			
			MemberDAO memberDao = new MemberDAO();
			String dbPw = memberDao.login(id);
			
			if(dbPw != null && dbPw.equals(pw)) {
				alert.setContentText("로그인 성공");
			}else {
				alert.setContentText("로그인 실패");
			}
			alert.show();
//			System.out.println(idFld.getText());
//			System.out.println(pwFld.getText());
		});
		
		primaryStage.setTitle("Quiz2");
		primaryStage.setScene(new Scene(box, 300, 200));
		primaryStage.show();
	}
}










