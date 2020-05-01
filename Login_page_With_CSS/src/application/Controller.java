package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private AnchorPane pane;

    @FXML
    private Label header;

    @FXML
    private Label username;

    @FXML
    private Label password;

    @FXML
    private TextField usr;

    @FXML
    private PasswordField pass;
    @FXML
    private Label status;
    @FXML
    private Button btn;
    
    public void eventButton(ActionEvent e)
    {
    	String user = usr.getText();
    	String paswrd = pass.getText();
    	
    	if(user.equals("Ashlesh")&& paswrd.equals("1234"))
    	{
    		status.setStyle("-fx-text-fill:green");
    		status.setText("Login successful");
    	}else
    	{
    		status.setStyle("-fx-text-fill:red");
    		status.setText("Login failed");
    	}
    }

}
