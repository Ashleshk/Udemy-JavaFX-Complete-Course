package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class MainController implements Initializable{

	    @FXML
	    private AnchorPane anPane;

	    @FXML
	    private JFXButton round1;

	    @FXML
	    private JFXButton roundtwo;
	  
	    private static MainController instance;
	    
	  private double xOffset;
	  private double yOffset;
	  
	  static int random_no;

    public MainController()
     	{
     		instance = this;
     	}
     	

    public static MainController getInstance()
     	{
     		return instance;
     	}	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Draggeable Screen
		 anPane.setOnMousePressed(event -> {
	            xOffset = Main.getPrimaryStage().getX() - event.getScreenX();
	            yOffset = Main.getPrimaryStage().getY() - event.getScreenY();
	            anPane.setCursor(Cursor.CLOSED_HAND);
	        });

		 anPane.setOnMouseDragged(event -> {
			 Main.getPrimaryStage().setX(event.getScreenX() + xOffset);
			 Main.getPrimaryStage().setY(event.getScreenY() + yOffset);

	        });
		
		 anPane.setOnMouseReleased(event -> {
			 anPane.setCursor(Cursor.DEFAULT);
	        });
		
				
	}
	

    @FXML
	  public void roundOneAction(ActionEvent event) throws IOException {

		    round1.getScene().getWindow().hide();
			
			Stage signup = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/Style/MainQuizView.fxml"));
			Scene scene = new Scene(root);
			signup.setScene(scene);
			signup.show();
			signup.setResizable(false);
		  
			 random_no = RandomNumbers.randomFunction(); //get random no 
	  }


	    @FXML
	    void closeApp(ActionEvent event) {

	    	System.exit(0); //exit from application
	    	
	  }
	   

    public int getRandomNo()
		 {
			
			 return random_no; //return rand no 
			   
		 }
		   
	    
}
