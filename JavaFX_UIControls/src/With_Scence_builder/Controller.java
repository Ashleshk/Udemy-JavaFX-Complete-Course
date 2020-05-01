 
package With_Scence_builder;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller implements Initializable{

    @FXML
    private ChoiceBox<String> Choice;
    @FXML
    private PasswordField pass;

    @FXML
    private TextField usr;
    @FXML
    private Button button;

    @FXML
    void eventButton(MouseEvent event) {
   System.out.println(Choice.getSelectionModel().getSelectedItem());
    }
    
    @FXML
    void eventButton(ActionEvent event) {
   System.out.println(usr.getText());
   System.out.println(pass.getText());
    
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Choice.getItems().addAll("Java","javaFX","CPP","HTML");
		
	}

} 
     

   

    
