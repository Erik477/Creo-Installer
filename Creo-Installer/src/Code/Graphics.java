package Code;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Graphics extends Application{
	Stage window;
	Scene Start,s2,s3;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;
		
		Label label1 = new Label("Wilkommen zum Creo_Installer");
		Button button1 = new Button("Starten");
		button1.setOnAction(e -> newClass());
				
		VBox layout1 = new  VBox(30);
		layout1.getChildren().addAll(label1,button1);
		Start = new Scene(layout1,300,200);
		
		
		Label label2 = new Label("Please make sure the Directory ProE_CD_Student is stored in the C: Drive");
		ProgressBar pb = new ProgressBar(0.6);
		ProgressIndicator pi = new ProgressIndicator(0.6);
		Region r = new Region();
		r.setPrefWidth(150);
			
		VBox layout2 = new VBox(10);	
		HBox layout3 = new HBox();
		layout3.getChildren().addAll(r,pb,pi);
		layout2.getChildren().addAll(label2,layout3);
		s2 = new Scene(layout2, 600, 300);
		
		Label label3 = new Label("OGE");
		HBox layout4 = new HBox();
		
		layout4.getChildren().add(label3);
		
		s3 = new Scene(layout4, 600, 300);
		
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
		
		File f = new File("C://");
	
		window.setScene(s2);
//		os.searchFile(f, serchingfor);
//		window.setScene(s3);
	}

}
