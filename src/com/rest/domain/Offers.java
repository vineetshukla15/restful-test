package com.rest.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "offers")
public class Offers implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String beaconID;
	private String categoryID;
	private String offerID;
	private String title;
	private String description;
	
	public Offers(){
		
	}
	
	public Offers(String beaconID,String categoryID,String offerID){
		
		this.beaconID = beaconID;
		this.categoryID = categoryID;
		this.offerID =  offerID;
		
	}
	
	
	public String getBeaconID() {
		return beaconID;
	}
	@XmlElement
	public void setBeaconID(String beaconID) {
		this.beaconID = beaconID;
	}
	public String getCategoryID() {
		return categoryID;
	}
	@XmlElement
	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}
	public String getOfferID() {
		return offerID;
	}
	
	@XmlElement
	public void setOfferID(String offerId) {
		this.offerID = offerId;
	}
	public String getTitle() {
		return title;
	}
	
	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	
	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}

}
