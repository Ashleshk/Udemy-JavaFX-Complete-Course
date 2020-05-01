package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author GENISYS-X
 */
public class View implements Initializable{

	    @FXML
	    private Label Marks;
	    
	    @FXML
	    private JFXButton home;

    /**
     *
     */
    public static int langno;
	    
        private static View instance;
    	
    /**
     *
     */
    public View()
    	{
    		instance = this;
    	}
    	
    /**
     *
     * @return
     */
    public static View getInstance()
    	{
    		return instance;
    	}	
	    
	   
	    @FXML
	    void goToHome(ActionEvent event) throws IOException {
	    		    	
	    	  home.getScene().getWindow().hide();
			
			  Stage Result = new Stage();
			  Parent root = FXMLLoader.load(getClass().getResource("/Style/MainView.fxml"));
			  Scene scene = new Scene(root);
			  Result.setScene(scene);
			  Result.show();
			  Result.setResizable(false);
	    		    	
	    }


		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			//Get Final Score
            int no = JavaQuizController.getInstance().calCorrectAnswer();
			//Set Final Score
			Marks.setText(no+"/30");
		}

		
}
