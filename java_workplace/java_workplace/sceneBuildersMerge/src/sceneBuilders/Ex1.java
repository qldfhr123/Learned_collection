package sceneBuilders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ex1 extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		System.out.println(getClass());
		getClass().getResource("ex1.fxml");
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ex1.fxml"));
		Parent form = loader.load();
		
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("Ex1");
		primaryStage.show();
		
	}

}
