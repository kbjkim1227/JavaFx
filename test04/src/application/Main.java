package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {
   @Override
   public void start(Stage stage) {
      try {
         // stage -> scene -> container -> node
         Label text = new Label();
         text.setText("Hello JavaFX");
         
         //CSS
         //text.setStyle(" -fx-font-size: 80 ");
         //text.setStyle(" -fx-font-size: 80; -fx-text-fill:green ");
         //text.setStyle(" -fx-font-size: 50; -fx-background-color:orange ");
         text.setStyle(" -fx-font-size: 50; -fx-border-color:black;"
         		+ " -fx-background-color:orange; -fx-text-fill:green ");
         
         StackPane pane = new StackPane(); // container
         pane.getChildren().add(text);
      
         
         Scene scene = new Scene(pane, 500,300);
         
         stage.setScene(scene);
         
         stage.show();
         stage.setResizable(false);

         
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
   
   public static void main(String[] args) {
      launch(args);
   }
}