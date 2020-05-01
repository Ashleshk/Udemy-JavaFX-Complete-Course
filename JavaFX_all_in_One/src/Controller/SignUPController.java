package Controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import DBConnection.connection;
import AlertMessage.Message;

public class SignUPController implements Initializable {

	
	    @FXML
	    private JFXTextField fullname;

	    @FXML
	    private JFXPasswordField password;

	    @FXML
	    private JFXTextField email;

	    @FXML
	    private JFXCheckBox check;

	    @FXML
	    private JFXButton signup;

	    @FXML
	    private JFXButton login;
	    
	    private java.sql.PreparedStatement ps;

	    Message msg = new Message();
	    
	    connection conOBJ = new connection();
	    Connection con;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		fullname.setStyle("-fx-text-inner-color:#afbccd;");
		email.setStyle("-fx-text-inner-color:#afbccd;");
		password.setStyle("-fx-text-inner-color:#afbccd;");
		
		
		
	}
	
	 @FXML
	  public void goLogin(ActionEvent event) throws IOException {

		 login.getScene().getWindow().hide();
		 
		 Stage login = new Stage();
		 Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/Login.fxml"));
		 Scene scene = new Scene(root);
		 login.setScene(scene);
		 login.show();
	 }

	@FXML
	 public void signUp(ActionEvent event) throws ClassNotFoundException, SQLException {
	
	 if(check.isSelected())
	 {		 
		
	   con = conOBJ.getConnection();
	   
	   String insert = "INSERT INTO student(fullName,password,email)"
			   +"Values (?,?,?)";
	   ps = con.prepareStatement(insert);
	   
	   ps.setString(1, fullname.getText());
	   ps.setString(2, password.getText());
	   ps.setString(3, email.getText());
	   
	   ps.executeUpdate();
	   
	   msg.setMessage("Data is Inserted");
	}
	 else
	 {
		 msg.setMessage("Agree terms and condition");
	 }
	 
   }
}
