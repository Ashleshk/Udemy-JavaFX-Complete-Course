package With_scene_builder;

import java.net.URL;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller implements Initializable{
	@FXML
    private JFXTextField usr;

    @FXML
    private JFXPasswordField pass;

    @FXML
    private JFXButton btn;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		 usr.setStyle("-fx-text-inner-color:blue");
		
	}
	  @FXML
	    void eventbtn(ActionEvent event) {
   System.out.println(usr.getText());
   System.out.println(pass.getText());
	    }

}
 