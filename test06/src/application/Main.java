package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			// stage>scene>container>node
	         Label label = new Label();
	         label.setText(Integer.toString(num));
	         label.setStyle(" -fx-font-size: 50 ");
	         
	         Button button = new Button ();
	         button.setText("ADD");
	         button.setStyle(" -fx-font-size: 15 ");
	         button.setOnAction(e ->{
	        	 num++;
	        	 label.setText(Integer.toString(num));
	         });
	         


			
			StackPane pane = new StackPane(); // container 
			pane.getChildren().addAll(label,button);
			StackPane.setAlignment(button, Pos.BOTTOM_CENTER);
			
			Scene scene = new Scene(pane, 300,300);
			
			stage.setScene(scene);
			stage.setTitle("Add Program");
			stage.setResizable(false);
	
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	int num = 0; // 전역변수
	
	public static void main(String[] args) {
		launch(args);
	}
}
