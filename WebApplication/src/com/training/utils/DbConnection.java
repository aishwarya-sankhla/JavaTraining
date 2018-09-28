package com.training.utils;

import java.sql.*;
import java.util.Properties;
import java.io.*;

public class DbConnection {
	public static Connection getOracleConnection(InputStream inStream) {
		Connection com = null;
		
		try {
			
			Properties props = new Properties();
			props.load(inStream);
			Class.forName(props.getProperty("db.driverClass"));
			
			String url = props.getProperty("db.url");
			String user = props.getProperty("db.userName");
			String password = props.getProperty("db.passWord");
			
			com = DriverManager.getConnection(url,user,password);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return com;
	}
}
