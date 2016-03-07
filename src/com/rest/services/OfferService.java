package com.rest.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.dao.proxy.DAOProxy;
import com.rest.domain.Offers;

@Path("/OfferService")
public class OfferService {

	@GET
	@Path("/offers")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Offers> getOffers() {
		DAOProxy proxy = new DAOProxy();
		return proxy.findAllOffer();
	}

}
