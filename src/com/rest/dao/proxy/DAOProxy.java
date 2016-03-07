package com.rest.dao.proxy;

import java.util.List;

import com.rest.dao.IDAO;
import com.rest.dao.OffersDAO;
import com.rest.dao.UserDAO;
import com.rest.domain.Offers;
import com.rest.domain.User;

public class DAOProxy implements IDAO {
	private IDAO idao;

	@Override
	public List findAll() {
		return idao.findAll();
	}

	public List<User> findAllUser() {
		idao = new UserDAO();
		return findAll();
	}

	public List<Offers> findAllOffer() {
		idao = new OffersDAO();
		return findAll();
	}

}
