package Code;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Graphics extends Application{
	Stage window;
	Scene Start,s2;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;
		
		Label label1 = new Label("Wilkommen zum Creo_Installer");
		Button button1 = new Button("Starten");
		button1.setOnAction(e -> newClass());
				
		
		VBox layout1 = new  VBox(20);
		layout1.getChildren().addAll(label1,button1);
		Start = new Scene(layout1,300,200);
		
		
		Label label2 = new Label("Please Wait");
		
		
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(label2);
		s2 = new Scene(layout2, 600, 300);
		
//		window.setHeight(200);
//		window.setWidth(300);
		
		window.setScene(Start);
		window.setTitle("Creo_Installer");
		window.show();

	}
	public void newClass() {
		Ordner_Suche os = new Ordner_Suche();
		String serchingfor = new String();
		serchingfor = "ProE_CD_Student";
		
		File f = new File("C:/");
		
		os.searchFile(f, serchingfor);
		window.setScene(s2);
	}

}
