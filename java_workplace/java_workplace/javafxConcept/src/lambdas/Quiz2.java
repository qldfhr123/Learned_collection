package lambdas;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz2 extends Application{
	public static void main(String[] args) {
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane border = new BorderPane();
		Label id_la = new Label("ID");
		Label pw_la = new Label("PW");
		TextField id_txt = new TextField("");
		TextField pw_txt = new TextField("");
		
		HBox id = new HBox();
		id.getChildren().addAll(id_la, id_txt);
		id.setSpacing(10);
		id.setAlignment(Pos.CENTER);
		
		HBox pw = new HBox();
		pw.getChildren().addAll(pw_la, pw_txt);
		pw.setSpacing(10);
		pw.setAlignment(Pos.CENTER);
		
		VBox insert = new VBox();
		insert.getChildren().addAll(id, pw);
		insert.setSpacing(10);
		
		Button buttonLogin = new Button("로그인");
		buttonLogin.setPrefSize(100, 60);
		border.setRight(buttonLogin);
		
		EventHandler<Event> event2 = e -> {
			
			Alert alert = new Alert(AlertType.INFORMATION);
			String user_id = ""; 
			String user_password = "";
			
			user_id = id_txt.getText();
			user_password = pw_txt.getText();
			
			String admin_id = "admin";
			String admin_pw = "1234";
			
			if(user_id.equals(admin_id) && user_password.equals(admin_pw)) {
				
				alert.setHeaderText("로그인");
				alert.setContentText("성공");
				alert.show();
			}
			else {
				alert.setHeaderText("로그인");
				alert.setContentText("실패");
				alert.show();
			}
			
		};
		buttonLogin.setOnMouseClicked(event2);
		
		
		HBox insert2 = new HBox();
		insert2.getChildren().addAll(insert, buttonLogin);
		insert2.setSpacing(10);
		insert2.setPadding(new Insets(60));
		border.setRight(insert2);
		
		
		primaryStage.setTitle("Quiz2");
		primaryStage.setScene(new Scene(border, 400, 200));
		primaryStage.show();
		
	}
}
