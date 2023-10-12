package lambdas;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz1 extends Application{
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox box = new HBox();
		box.setSpacing(60);
		box.setAlignment(Pos.CENTER);
		
		Label labelLeft = new Label("Search", new ImageView("/img/search.png"));
		labelLeft.setStyle("-fx-background-color: pink");
		labelLeft.setStyle("-fx-text-fill: blue;");
		labelLeft.setOnMouseEntered(
				e1 -> {
					labelLeft.setScaleX(2);
					labelLeft.setScaleY(2);
				}
				);
		labelLeft.setOnMouseExited(
				e2 -> {
					labelLeft.setScaleX(1);
					labelLeft.setScaleY(1);
				}
				);
		
		Label labelCenter = new Label("Values");
		labelCenter.setLayoutX(120);
		labelCenter.setLayoutY(120);
		labelCenter.setRotate(270);
		labelCenter.setStyle("-fx-background-color: pink");
		labelCenter.setOnMouseEntered(
			e1 -> {
					labelCenter.setScaleX(2);
					labelCenter.setScaleY(2);
					labelCenter.setRotate(0);
					}
				);
		labelCenter.setOnMouseExited(
			e2 -> {
				labelCenter.setScaleX(1);
				labelCenter.setScaleY(1);
				labelCenter.setRotate(270);
					}
				);
		
		
		Label labelRight = new Label("A label that\n needs to be\n wapped");
		labelRight.setStyle("-fx-background-color: pink");
		labelRight.setOnMouseEntered(
			e1 -> {
					labelRight.setScaleX(2);
					labelRight.setScaleY(2);
					}
				);
		labelRight.setOnMouseExited(
			e2 -> {
					labelRight.setScaleX(1);
					labelRight.setScaleY(1);
					}
				);
		
		box.getChildren().addAll(labelLeft, labelCenter, labelRight);
		
		primaryStage.setTitle("Quiz_Event");
		primaryStage.setScene(new Scene(box, 500, 200));
		primaryStage.show();
	}
}
