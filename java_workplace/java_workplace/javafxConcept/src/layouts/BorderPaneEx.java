package layouts;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BorderPaneEx extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button[] button = new Button[5];
		String[] buttonNames = {"TOP","LEFT","CENTER","RIGHT","BOTTOM"};
		
		for(int i = 0; i < button.length;i++) {
			button[i] = new Button(buttonNames[i]);
		}
		
		BorderPane border = new BorderPane();
		FlowPane flowTop = new FlowPane(); //다른레이아웃을 사용하여 특정 부분에 스타일을 지정할수있다
		flowTop.getChildren().add(button[0]);
		flowTop.setAlignment(Pos.CENTER);
		flowTop.setStyle("-fx-background-color: pink");
		flowTop.setPrefHeight(100);
		border.setTop(flowTop);
		
		
//		border.setTop(button[0]);
		border.setLeft(button[1]);
		border.setCenter(button[2]);
		border.setRight(button[3]);
		border.setBottom(button[4]);
		
		primaryStage.setScene(new Scene(border, 400,200));
		primaryStage.show();
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
