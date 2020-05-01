package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import DBConnection.connection;
import AlertMessage.Message;

public class LoginController {

	
	@FXML
    private AnchorPane anPane;

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton register;

    @FXML
    private JFXButton login;
    
    private PreparedStatement pst;
    
    Connection con;
    
    connection conClass = new connection();
    Message msg = new Message();
 
    @FXML
    void createLogin(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {

    	con = conClass.getConnection();
    	System.out.println("Connection to database");
    	String str = "SELECT *FROM STUDENT where email=? and password=?";
    	
    	pst = con.prepareStatement(str);
    	
    	pst.setString(1, username.getText());
        pst.setString(2,password.getText());
        
        ResultSet rs = pst.executeQuery();
        int count=0;
        
        while(rs.next())
        {
        	count = count+1;
        }
    	
        if(count==1)
        {
        	System.out.println("Login succesfull");
        	login.getScene().getWindow().hide();
        	
        	Stage home = new Stage();
        	Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/HomePage.fxml"));
        	home.setScene(new Scene(root));
        	home.show();
        }
        else
        {
        	msg.setMessage("Login is failed");
        }
       
    }

    @FXML
    void createregister(ActionEvent event) throws IOException {
    	
    	register.getScene().getWindow().hide();
    	
    	Stage signup = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/SignUP.fxml"));
    	Scene scene = new Scene(root);
    	signup.setScene(scene);
    	signup.show();

    }

	
}
