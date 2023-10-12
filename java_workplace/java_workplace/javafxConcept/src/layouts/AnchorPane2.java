package layouts;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.*;


public class AnchorPane2 extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ListView<String> lv  = new ListView<>();
		lv.getItems().addAll("1","2","3");
		lv.setPrefSize(100,70);
		lv.setLayoutX(90);
		lv.setLayoutY(70);
		
		AnchorPane anchor = new AnchorPane();
		anchor.getChildren().add(lv);
		
		Scene scene = new Scene(anchor,300,200);
		primaryStage.setTitle("AnchorPane2");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
