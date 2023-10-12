package sceneBuilders;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Ex2 extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		System.out.println(getClass());
		getClass().getResource("ex2.fxml");
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ex2.fxml"));
		Parent form = loader.load();
		
		ListView<String> listView = (ListView<String>)form.lookup("#listView");
		//ListView<String> listView = (ListView<String>)form.lookup("#listView");
		listView.getItems().addAll("아이템1","아이템2","아이템3");
		
		Label menuLabel = (Label)form.lookup("#menuLabel");
		
		EventHandler<Event> event2 = e -> {
			
			Alert alert = new Alert(AlertType.INFORMATION);

				alert.setContentText("메뉴를 클릭하셨습니다");
				alert.show();
			
			
		};
		menuLabel.setOnMouseClicked(event2);
		
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("Ex2");
		primaryStage.show();
		
	}

}
