package layouts;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPane2 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		
		ArrayList<Button>tmpList = new ArrayList<Button>();
		for(int i = 1; i < 10; i++) { //규칙이있는 상태를 만들기위해
			Button button = new Button("버튼"+i);
			tmpList.add(button);
		}		
		
		
	
		
		FlowPane flowPane = new FlowPane();
		ObservableList<Node>list = flowPane.getChildren(); //리스트에 버튼을 넣어준다
		list.addAll(tmpList);
		
		primaryStage.setScene(new Scene(flowPane, 200,200));
		primaryStage.show();
		
	}
}
