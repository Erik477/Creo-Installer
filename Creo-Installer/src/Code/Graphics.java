package Code;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Graphics extends Application{
	Stage window;
	Scene s1,s2;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;
		
		Label label1 = new Label("Wilkommen zum Creo_Installer");
		Button button1 = new Button("Starten");
		button1.setOnAction(e -> window.setScene(s2));
		
		
		
		VBox layout1 = new  VBox(20);
		layout1.getChildren().addAll(label1,button1);
		s1 = new Scene(layout1);
		
		window.setHeight(200);
		window.setWidth(300);
		
		window.setScene(s1);
		window.setTitle("Creo_Installer");
		window.show();

	}

}
