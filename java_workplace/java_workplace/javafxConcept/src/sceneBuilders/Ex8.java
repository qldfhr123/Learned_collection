package sceneBuilders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Ex8 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ex8.fxml"));
		Parent form = loader.load();
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("ex8");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}


