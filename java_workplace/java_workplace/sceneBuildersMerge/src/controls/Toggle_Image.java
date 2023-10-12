package controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Toggle_Image extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//버튼을 눌렀을 때 그 현상이 지속되는 상태를
				//만들어줄 때 사용함.(스킬 활성화/비활성화)
				ToggleButton bt1 = new ToggleButton();
				ToggleButton bt2 = new ToggleButton();
				ToggleButton bt3 = new ToggleButton();
				
				//다중선택을 단일선택으로 바꿈.
				ToggleGroup group = new ToggleGroup();
				bt1.setToggleGroup(group);
				bt2.setToggleGroup(group);
				bt3.setToggleGroup(group);
			
				//setGraphic을 통해 이미지로 버튼을 만들 수 있다.
				//직업선택
				bt1.setGraphic(new ImageView("/img/magi.png"));
				bt2.setGraphic(new ImageView("/img/rogue.png"));
				bt3.setGraphic(new ImageView("/img/warrior.png"));
						
				HBox box = new HBox();
				box.getChildren().addAll(bt1, bt2, bt3);
				box.setAlignment(Pos.CENTER);
				box.setSpacing(10);
				
				primaryStage.setScene(new Scene(box, 600, 200));
				primaryStage.show();
		
	}

}
