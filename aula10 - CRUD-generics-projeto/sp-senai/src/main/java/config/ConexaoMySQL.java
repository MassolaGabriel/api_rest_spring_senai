package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
	private static final String URL = "jdbc:mysql://localhost:3306/sp_senai";
	private static final String USER = "root";
	private static final String PASSWORD = "bcd101";
	
	public Connection getConexao() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
