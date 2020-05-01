package application;
	
import java.sql.SQLException;

import DBConnection.connection;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			connection con = new connection();
			Button btn = new Button("Connect to database");
			Pane root = new  Pane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			btn.setOnAction(e->{
				try {
					con.getConnection();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			root.getChildren().addAll(btn);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
