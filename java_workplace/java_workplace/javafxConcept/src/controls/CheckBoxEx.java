package controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxEx extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		CheckBox check1 = new CheckBox("체크1");
		CheckBox check2 = new CheckBox("체크2");
		
		check1.setText("1234");
		check2.setText("4567");
		
		//check2.setSeleted(true); 체크가 되어있다
		
		System.out.println("check1 : "+check1.isSelected());
		System.out.println("check1 : "+check1.getText());
		System.out.println("check2 : "+check2.isSelected());
		System.out.println("check2 : "+check2.getText());
	
		
		VBox box = new VBox();
		box.getChildren().addAll(check1, check2);
		box.setSpacing(10);
		box.setAlignment(Pos.CENTER);
		
		primaryStage.setTitle("CheckBoxEx");
		primaryStage.setScene(new Scene(box, 300, 200));
		primaryStage.show();
	}

}
