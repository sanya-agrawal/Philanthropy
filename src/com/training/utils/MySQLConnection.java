/**
 * 
 */
package com.training.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.*;

/**
 * @author sagr26
 *
 */
public class MySQLConnection {
	public static Connection getMyOracleConnection(){
		Connection con = null;
		try {
			Properties props = new Properties();
			FileInputStream inStream = new FileInputStream(new File("DBConnection.properties"));
			props.load(inStream);
			
			Class.forName(props.getProperty("db.driverClass"));
			con = DriverManager.getConnection(props.getProperty("db.driverURL"),props.getProperty("db.userName"),props.getProperty("db.password"));
			
			
		} catch (Exception e) {
			// TODO: handle exception
            e.printStackTrace();
		}
		return con;
	}

	
	
}
