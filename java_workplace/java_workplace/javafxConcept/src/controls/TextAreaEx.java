package controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextAreaEx extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("TextArea Test");
		
		TextArea area = new TextArea();
		area.setMaxSize(350, 150);
		
		HBox box = new HBox();
		box.getChildren().addAll(area);
		box.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(box, 400, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
