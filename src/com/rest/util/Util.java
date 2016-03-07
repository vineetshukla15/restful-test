package com.rest.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class Util {

	
	public static List convertResultSetToList(ResultSet res) throws SQLException {		
		
		ResultSetMetaData rsMetaData = res.getMetaData();
	    int columnCount = rsMetaData.getColumnCount();
	    ArrayList<Object[]> result = new ArrayList<Object[]>();
	    Object[] header = new Object[columnCount];
	    for (int i=1; i <= columnCount; ++i){
	        Object label = rsMetaData.getColumnLabel(i);
	        header[i-1] = label;
	    }
	    
	    while (res.next()){
	        Object[] str = new Object[columnCount];
	        for (int i=1; i <= columnCount; ++i){
	            Object obj = res.getObject(i);
	            str[i-1] = obj;
	        }
	        result.add(str);
	    }
	    /*int resultLength = result.size()+1;
	    Object[][] finalResult = new Object[resultLength][columnCount];
	    finalResult[0] = header;
	    for(int i=1;i<resultLength;++i){
	        Object[] row = result.get(i-1);
	        finalResult[i] = row;
	    }*/
	    System.out.println("******final result*****");
	    
	    System.out.println(result);
	    
	    System.out.println("***********************");
	    return result;
	}
	
	
}
