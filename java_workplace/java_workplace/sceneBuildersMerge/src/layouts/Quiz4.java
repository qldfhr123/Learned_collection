package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz4 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		Pane p3 = new Pane();
		
		p1.setPrefHeight(50);
		p2.setPrefHeight(50);
		p3.setMaxHeight(110);
		
		p1.setPrefWidth(200);
		p2.setPrefWidth(200);
		p3.setPrefWidth(100);
		
		p1.setStyle("-fx-background-color: red");
		p2.setStyle("-fx-background-color: orange");
		p3.setStyle("-fx-background-color: black");
		
		VBox box = new VBox();
		box.getChildren().addAll(p1, p2);
		box.setSpacing(10);
		box.setAlignment(Pos.CENTER);
		
		HBox box1 = new HBox();
		box1.getChildren().addAll(box, p3);
		box1.setSpacing(10);
		box1.setAlignment(Pos.CENTER);
		
		primaryStage.setTitle("Quiz4");
		primaryStage.setScene(new Scene(box1, 500, 500));
		primaryStage.show();
	}

}




