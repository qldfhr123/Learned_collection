package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Quiz5 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Quiz5");
		
		StackPane stack = new StackPane();
		ImageView iv = new ImageView("/img/quiz.jpg");
		BorderPane border = new BorderPane();
		
		//왼쪽 List
		ListView<String> lv = new ListView<String>();
		lv.getItems().addAll("아이템1", "아이템2", "아이템3");
		lv.setPrefSize(80, 120);
		AnchorPane anchor = new AnchorPane();
		anchor.getChildren().add(lv);
		
		//상단 Label
		Label menu = new Label();
		Label home = new Label();
		Label login = new Label();
		
		menu.setText("메뉴");
		home.setText("홈");
		login.setText("로그인");

		//상단
		FlowPane flowTop = new FlowPane();
		flowTop.setHgap(100);
		flowTop.setStyle("-fx-background-color: pink");
		flowTop.setAlignment(Pos.CENTER);
		flowTop.setPadding(new Insets(30));
		
		flowTop.getChildren().addAll(menu, home, login);
		border.setTop(flowTop);
		
		//왼쪽
		FlowPane flowLeft = new FlowPane();
		flowLeft.setPrefWidth(100);
		flowLeft.getChildren().add(anchor);
		border.setLeft(flowLeft);
		
		//중앙
		FlowPane flowCenter = new FlowPane();
		flowCenter.getChildren().add(new Button("내용 들어가는 곳"));
		flowCenter.setAlignment(Pos.TOP_LEFT);
		flowCenter.setPrefWidth(50);
		border.setCenter(flowCenter);
		
		//오른쪽
		Button buttonId = new Button("아이디 입력");
		Button buttonPw = new Button("비밀번호 입력");
		Button buttonLogin = new Button("로그인");
	
		buttonId.setPrefSize(120, 30);
		buttonPw.setPrefSize(120, 30);
		buttonLogin.setPrefSize(100, 60);
		
		GridPane gridRight = new GridPane();
		gridRight.add(buttonId, 1, 0);
		gridRight.add(buttonPw, 1, 1);
		gridRight.add(buttonLogin, 2, 0, 1, 2);
		gridRight.setPadding(new Insets(40));
		border.setRight(gridRight);
		
		//아래
		FlowPane flowBottom = new FlowPane();
		flowBottom.setPrefHeight(40);
		flowBottom.getChildren().add(new Button("바닥글 들어가는 곳"));
		flowBottom.setAlignment(Pos.CENTER);
		border.setBottom(flowBottom);
		
		stack.getChildren().addAll(iv, border);
		
		primaryStage.setScene(new Scene(stack, 500, 335));
		primaryStage.show();
	}

}