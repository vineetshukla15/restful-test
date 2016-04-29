package com.rest.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.rest.constants.QueryConstants;
import com.rest.domain.User;
import com.rest.manager.db.datasource.DataSource;
import com.rest.mapper.ConvertToDTO;
import com.rest.util.Util;

public class UserDAO implements IDAO {

	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	
	
	
	
	@Override
	public List<User> findAll() {

		List<User> userList = new ArrayList<User>();
		try {
			connection = DataSource.getInstance().getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(QueryConstants.GET_USER_DETAIL);
			Iterator<Object[]> iterator = Util
					.convertResultSetToList(resultSet).iterator();
			while (iterator.hasNext()) {
				User user = new User();
				ConvertToDTO.convertObjArrToUser((Object[]) iterator.next(),
						user);
				userList.add(user);
			}

			/*
			 * List<User> list = new QueryRunner() .query(connection,
			 * "SELECT first_name, last_name FROM table", new
			 * ArrayListHandler()) .stream() .map(arrList -> new
			 * User(arrList.get
			 * (0),arrList.get(1),arrList.get(2),arrList.get(3)))
			 * .collect(Collectors.toList());
			 */

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Somehting went wrong here.....");
		} finally {
			try {
				connection.close();
				statement.close();
				resultSet.close();
			} catch (Exception ex) {
				ex.printStackTrace();

			}
		}
		return userList;
	}

}
