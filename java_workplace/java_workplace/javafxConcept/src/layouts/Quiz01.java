package layouts;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Quiz01 extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane border = new BorderPane();
		
		ArrayList<Label> labels = new ArrayList<>();
		labels.add(new Label("메뉴"));
		labels.add(new Label("홈"));
		labels.add(new Label("로그인"));
		
		FlowPane flowTop = new FlowPane();
		flowTop.getChildren().addAll(labels);
		flowTop.setHgap(90);
		flowTop.setAlignment(Pos.CENTER);
		flowTop.setStyle("-fx-background-color: #B5B2FF");
		flowTop.setPrefHeight(50);
		
		border.setTop(flowTop);
		
		Button leftButton = new Button("메뉴 나열");
		FlowPane flowLeft = new FlowPane();
		flowLeft.getChildren().add(leftButton);
		flowLeft.setPrefWidth(120);
		flowLeft.setStyle("-fx-background-color: #0054FF");
		border.setLeft(flowLeft);
		
		Button centerButton = new Button("내용 들어가는 곳");
		FlowPane flowcenter = new FlowPane();
		flowcenter.getChildren().add(centerButton);
		
		flowcenter.setStyle("-fx-background-color: #ABF200");
		border.setCenter(flowcenter);
		
		Button idButton = new Button("아이디 입력");
		Button pwButton = new Button("비밀번호 입력");
		Button loginButton = new Button("로그인");
		
		idButton.setPrefSize(120, 30);
		pwButton.setPrefSize(120, 30);
		loginButton.setPrefSize(60, 60);
		
		GridPane gridRight = new GridPane();
		gridRight.add(idButton, 0, 0);
		gridRight.add(pwButton, 0, 1);
		gridRight.add(loginButton, 1, 0, 1, 2);
		gridRight.setPrefWidth(250);
		gridRight.setStyle("-fx-background-color: #FAF4C0");
		gridRight.setAlignment(Pos.TOP_CENTER);
		gridRight.setPadding(new Insets(30, 0, 0, 0));
		border.setRight(gridRight);
		
		Button bottomButton = new Button("바닥글 들어가는 곳");
		FlowPane flowBottom = new FlowPane();
		flowBottom.getChildren().add(bottomButton);
		
		flowBottom.setAlignment(Pos.CENTER);
		flowBottom.setStyle("-fx-background-color: #B2EBF4");
		flowBottom.setPrefHeight(50);
		
		border.setBottom(flowBottom);
		
		primaryStage.setScene(new Scene(border, 500, 300));
		primaryStage.setTitle("Quiz1");
		primaryStage.show();
	}
}











