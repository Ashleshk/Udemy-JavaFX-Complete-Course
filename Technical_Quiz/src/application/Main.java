package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
	private static Stage primaryStageObj;
	
	@Override
	public void start(Stage primaryStage) {
		try {
		   
			primaryStageObj = primaryStage;
			Parent root = FXMLLoader.load(getClass().getResource("/Style/MainView.fxml"));			
			Scene scene = new Scene(root);
		    primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

    public static void main(String[] args) {
		launch(args);
	}


    public static Stage getPrimaryStage() {
	        return primaryStageObj;
	 }

}
