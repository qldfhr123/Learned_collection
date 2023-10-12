package layouts;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.*;


public class AnchorPane1 extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button[] button = new Button[5];
		String[] buttonNames = {"TOP","LEFT","CENTER","RIGHT","BOTTOM"};
		
		for(int i = 0; i < button.length;i++) {
			button[i] = new Button(buttonNames[i]);
		}
		
		AnchorPane.setTopAnchor(button[0], 10.0);
		AnchorPane.setLeftAnchor(button[1], 30.0);
		AnchorPane.setRightAnchor(button[2], 20.0);
		AnchorPane.setBottomAnchor(button[3], 40.0);
		
		AnchorPane anchor = new AnchorPane();
		anchor.getChildren().addAll(button[0],button[1],button[2],button[3]);
		
		
		Scene scene = new Scene(anchor,300,200);
		primaryStage.setTitle("AnchorPane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
