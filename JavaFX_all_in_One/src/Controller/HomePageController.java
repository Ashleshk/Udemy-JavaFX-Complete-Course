package Controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import com.jfoenix.controls.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import DBConnection.connection;

public class HomePageController implements Initializable{

	    @FXML
	    private JFXButton show;

	    @FXML
	    private TableView<Student> table;

	    @FXML
	    private TableColumn<Student, String> fullname;

	    @FXML
	    private TableColumn<Student, String> password;

	    @FXML
	    private TableColumn<Student, String> email;
	    
	    Connection con;
	    
	    java.sql.PreparedStatement pst;
	    
	    connection conObj = new connection();
	    
	    @FXML
	    void showData(ActionEvent event) throws SQLException, ClassNotFoundException {

	    con = conObj.getConnection();
	    	
	    ObservableList<Student> data = FXCollections.observableArrayList();
	    
	    table.setItems(data);
	    
	     String str = "select * from student";
	     
	     pst = con.prepareStatement(str);
	    	
	     ResultSet rs = pst.executeQuery();
	     
	 	
			
	     
	     while(rs.next())
	     {
	    	 Student s = new Student(rs.getString("fullName"),rs.getString("password"),rs.getString("email"));
	    	 data.add(s);
	    	 
	     }
	     
	   }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		fullname.setCellValueFactory(new PropertyValueFactory<Student,String>("fullName"));
		password.setCellValueFactory(new PropertyValueFactory<Student,String>("password"));
		email.setCellValueFactory(new PropertyValueFactory<Student,String>("email"));
		
	}
	
}
