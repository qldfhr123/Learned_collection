package layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackPane2 extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		Label label = new Label("스마일 이미지");
		BorderPane border = new BorderPane();
		border.setBottom(label);
		
		ImageView iv = new ImageView("/img/SmileReRe.png");
		StackPane stack = new StackPane();
		stack.getChildren().addAll(iv,border);
		
		primaryStage.setTitle("StackPane2");
		primaryStage.setScene(new Scene(stack,500,300));
		primaryStage.show();
		
	}

}
