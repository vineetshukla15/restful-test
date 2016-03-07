package com.rest.mapper;

import com.rest.domain.Offers;
import com.rest.domain.User;

public class ConvertToDTO {
	
	public static void convertObjArrToUser(Object[] obj,User user){
		
	 String id = 		obj[0].toString();
   	 String name = 		obj[1].toString();
   	 String email = 	obj[2].toString();
   	 String dob =  		obj[3].toString();
   	 String gender =	obj[4].toString();
   	 
   	 
   	 user.setDob(dob);
   	 user.setId(id);
   	 user.setEmail(email);
   	 user.setName(name);
   	 user.setSex(gender); 
	}
	
	
	public static void convertObjArrToOffer(Object[] obj, Offers offer){
		
		 String beaconID = 		obj[0].toString();
	   	 String categoryID = 		obj[1].toString();
	   	 String offerID = 		obj[2].toString();
	   	 String offerDesc =  	obj[3].toString();
	   	 
	   	 offer.setBeaconID(beaconID);
	   	 offer.setCategoryID(categoryID);
	   	 offer.setOfferID(offerID);
	   	 offer.setDescription(offerDesc);
	   	  
		}

}
