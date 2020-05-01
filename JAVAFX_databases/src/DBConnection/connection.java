package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class connection {
	public void getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sstudentdata", "root", "root");
		 
		  System.out.println("Connected database");
		  
		  java.sql.Statement st = (Statement) con.createStatement();
		  String str="INSERT INTO `studentdata` VALUES ('9', 'appu', '5254', 'english', '413515', '46', '34');\r\n" ; 
		  st.executeUpdate(str);
		  System.out.println("Data is inserted");
		  
		  ResultSet rs = st.executeQuery("SELECT * FROM sstudentdata.studentdata");
		  while(rs.next())
		  {
			  System.out.println(rs.getInt("id")+" name:"+rs.getString("name"));
		  }
		  st.close();
		  con.close();
		  		 System.out.println("ConnectionCLosed");
		  
	}

}
