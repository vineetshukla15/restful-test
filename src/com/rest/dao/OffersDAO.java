package com.rest.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.rest.constants.QueryConstants;
import com.rest.domain.Offers;
import com.rest.manager.db.datasource.DataSource;
import com.rest.mapper.ConvertToDTO;
import com.rest.util.Util;

public class OffersDAO implements IDAO{

	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	@Override
	public List<Offers> findAll() {

		Iterator<Object[]> iterator;
		List<Offers> offerList = new ArrayList<Offers>();
		
		try {
			connection = DataSource.getInstance().getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(QueryConstants.GET_OFFER_INFO);
			iterator = Util.convertResultSetToList(resultSet).iterator();
			while (iterator.hasNext()) {
				Offers offer = new Offers();
				ConvertToDTO.convertObjArrToOffer((Object[]) iterator.next(),
						offer);
				offerList.add(offer);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				connection.close();
				statement.close();
				resultSet.close();
			} catch (Exception ex) {
				ex.printStackTrace();

			}
		}

		return offerList;

	}

}
