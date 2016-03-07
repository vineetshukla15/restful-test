package com.rest.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.dao.UserDAO;
import com.rest.dao.proxy.DAOProxy;
import com.rest.domain.User;

@Path("/UserService")
public class UserService {

	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsers() {
		DAOProxy proxy = new DAOProxy();
		return proxy.findAllUser();
	}

}
