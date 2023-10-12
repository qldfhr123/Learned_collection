package layouts;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPane1 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button1 = new Button();
		
		button1.setText("버튼1");
		
		Button button2 = new Button("버튼2");
		Button button3 = new Button("버튼3");
		Button button4 = new Button("버튼4");
		Button button5 = new Button("버튼5");
		Button button6 = new Button("버튼6");
		
		FlowPane flowPane = new FlowPane();
		ObservableList<Node>list = flowPane.getChildren(); //리스트에 버튼을 넣어준다
		
		list.addAll(button1,button2,button3,button4,button5,button6);
		
		primaryStage.setScene(new Scene(flowPane, 200,200));
		primaryStage.show();
		
	}
}
