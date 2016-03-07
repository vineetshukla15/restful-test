package com.rest.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String email;
	private String sex;
	private String dob;

	public User() {
	}

	public User(String name, String dob, String email, String sex) {
		this.email = email;
		this.name = name;
		this.dob = dob;
		this.sex = sex;	
		
	}
	
	
	public String getId() {
		return id;
	}

	@XmlElement
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDob() {
		return dob;
	}
	
	@XmlElement
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getSex() {
		return sex;
	}
	@XmlElement
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getEmail(){
		return email;
	}
	
	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}

	
}