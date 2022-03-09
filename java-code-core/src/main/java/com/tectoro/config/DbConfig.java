package com.tectoro.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class DbConfig {
	private Connection connection;
	
	public Connection connDb() throws SQLException,ClassNotFoundException {
		
		Class.forName("org.postgresql.Driver");
		 connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=hms","postgres","postgres");
		
		return connection;
	}

}
