package com.rest.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "userpref")
public class UserPreference {
	
	private String userID;
	private String categoryID;
	
	public UserPreference(String userID,String  categoryID){		
		this.userID =  userID;
		this.categoryID = categoryID;		
	}
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String user_id) {
		this.userID = user_id;
	}
	public String getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}
	

}
