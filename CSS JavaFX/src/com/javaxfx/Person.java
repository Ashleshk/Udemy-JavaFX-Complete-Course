package com.javaxfx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
	 
	private StringProperty firstName = new SimpleStringProperty(this,"firstName","");

	//return the StringProperty object
	public StringProperty firstNameProperty()
	{
		return firstName;
	}
	
	//return the firstname value 
	public String getFirstName()
	{
		return firstName.get();
	}
	
	//set the first name value
	public void setFirstName(String firstName)
	{
		this.firstName.set(firstName);
	}
 
	

}
