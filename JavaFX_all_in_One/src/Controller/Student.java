package Controller;

import javafx.beans.property.SimpleStringProperty;

public class Student {

	private final SimpleStringProperty fullname;            //SimpleStringPropery is an class that provide property to an string
	private final SimpleStringProperty password;
	private final SimpleStringProperty email;
	
    Student(String fname,String pass,String em)
	{
		this.fullname = new SimpleStringProperty(fname);
		this.password = new SimpleStringProperty(pass);
		this.email = new SimpleStringProperty(em);
	}
	
	public String getFullName()
	{
		return fullname.get();
	}
	
	public void setFullName(String fname)
	{
		fullname.set(fname);
	}
	
	public String getPassword()
	{
		return password.get();
	}
	
	public void setPassword(String pass)
	{
		password.set(pass);
	}
	
	public String getEmail()
	{
		return email.get();
	}
	
	public void setEmail(String em)
	{
		email.set(em);
	}
	
}
