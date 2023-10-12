package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPane1 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label id = new Label("ID");
		Label password = new Label("Password");
		
		TextField idField = new TextField();
		PasswordField pwField = new PasswordField();
		idField.setMaxWidth(200);
		pwField.setMaxWidth(200);
		
		Button loginButton = new Button("로그인");
		Button cancelButton = new Button("취소"); 
		loginButton.setPrefSize(100,30);
		cancelButton.setPrefSize(100,30);
		
		GridPane.setConstraints(id, 0, 0);
		GridPane.setConstraints(password, 0, 1);
		GridPane.setConstraints(idField, 1, 0);
		GridPane.setConstraints(pwField, 1, 1);
		
		FlowPane flow = new FlowPane();
		flow.setAlignment(Pos.CENTER);
		flow.setHgap(30);
		flow.getChildren().addAll(loginButton, cancelButton);
		flow.setStyle("-fx-background-color: #FFBB00;");
		
		GridPane.setConstraints(flow, 0, 2, 2, 1);
		
		GridPane grid = new GridPane();
		grid.getChildren().addAll(id, password, idField, pwField, flow);
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(30); // 수평
		grid.setVgap(20); // 수직
		grid.setPadding(new Insets(0, 0, 0, 50));
		
		
		primaryStage.setScene(new Scene(grid, 400, 200));
		primaryStage.setTitle("GridPane Exam01");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}









