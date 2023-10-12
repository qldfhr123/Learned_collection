package controls;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Quiz1 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Quiz1");
		BorderPane border = new BorderPane();
		
		ArrayList<Label> labels1 = new ArrayList<Label>();
		
		
		//상단
		labels1.add(new Label("홈"));
		labels1.add(new Label("사회"));
		labels1.add(new Label("경제"));
		labels1.add(new Label("국제"));
		labels1.add(new Label("문화"));
		
		
		FlowPane flowTop = new FlowPane();
		flowTop.setAlignment(Pos.CENTER);
		flowTop.setHgap(40);
		flowTop.setPadding(new Insets(30));
		
		flowTop.getChildren().addAll(labels1);
		
		border.setTop(flowTop);
		
		//왼쪽
		ArrayList<Label> labels2 = new ArrayList<Label>();
		labels2.add(new Label("카테고리"));
		labels2.add(new Label("노트북/PC"));
		labels2.add(new Label("자동차용품"));
		labels2.add(new Label("휴대폰"));
		labels2.add(new Label("캠핑/낚시"));
		
		VBox boxLeft = new VBox();
		boxLeft.getChildren().addAll(labels2);
		boxLeft.setSpacing(30);
		boxLeft.setPadding(new Insets(20));
		
		border.setLeft(boxLeft);
		
		//중앙
		Label idla = new Label("ID");
		Label pwla = new Label("PW");
		TextField idtxt = new TextField();
		PasswordField pwtxt = new PasswordField();
		
		HBox id = new HBox();
		id.getChildren().addAll(idla, idtxt);
		id.setSpacing(20);
		
		HBox pw = new HBox();
		pw.getChildren().addAll(pwla, pwtxt);
		pw.setSpacing(15);
		
		VBox member = new VBox();
		member.getChildren().addAll(id, pw);
		member.setPadding(new Insets(10));
		member.setSpacing(20);
		
		RadioButton female = new RadioButton("여");
		RadioButton male = new RadioButton("남");
		ToggleGroup group = new ToggleGroup();
		female.setToggleGroup(group);
		male.setToggleGroup(group);
		HBox sex = new HBox();
		sex.setSpacing(10);
		sex.getChildren().addAll(female, male);
		
		CheckBox hobby1 = new CheckBox("게임");
		CheckBox hobby2 = new CheckBox("코딩");
		HBox hobby = new HBox();
		hobby.setSpacing(10);
		hobby.getChildren().addAll(hobby1, hobby2);
		
		Label speak = new Label("하고 싶은 말");
		
		TextArea area = new TextArea();
		area.setMaxSize(200, 100);
		
		VBox total = new VBox();
		total.getChildren().addAll(member, sex, hobby, speak, area);
		total.setSpacing(20);
		total.setPadding(new Insets(20));
		
		border.setCenter(total);
		
		//오른쪽
		TextField idtxt2 = new TextField();
		idtxt2.setText("아이디");
		PasswordField pwtxt2 = new PasswordField();
		Button login = new Button("로그인");
		login.setPrefSize(100, 70);
		
		VBox insert = new VBox();
		insert.getChildren().addAll(idtxt2, pwtxt2);
		insert.setSpacing(10);
		
		HBox insert2 = new HBox();
		insert2.getChildren().addAll(insert, login);
		insert2.setSpacing(10);
		insert2.setPadding(new Insets(30));
		
		border.setRight(insert2);
		
		
		primaryStage.setScene(new Scene(border, 700, 400));
		primaryStage.show();
		
		
	}

}
