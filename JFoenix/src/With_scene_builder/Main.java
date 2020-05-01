package With_scene_builder;

import com.jfoenix.controls.JFXTextField;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
		Scene scene = new Scene(root,400,400);
		  
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
		public static void main(String[] args) {
			launch(args);
		}
}
