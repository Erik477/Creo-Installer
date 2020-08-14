package Test_things;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Switchingscenes extends Application{

	Stage window;
	Scene s1,s2;
	
	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		window = primaryStage;
		
		Label label1 = new Label("Welcome to Scene 1");
		Button button1 = new Button("Go to Scene 2");
		button1.setOnAction(e -> window.setScene(s2));
		
		VBox layout1 = new  VBox(20);
		layout1.getChildren().addAll(label1,button1);
		s1 = new Scene(layout1, 200, 200);
		
		Button button2 = new Button("Go to Scene 1");
		button2.setOnAction(e -> window.setScene(s1));
		
		
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		s2 = new Scene(layout2, 600, 300);
		
		window.setScene(s1);
		window.setTitle("You're to fast for me");
		window.show();
	}

}
