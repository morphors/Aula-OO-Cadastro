package com.estudo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection obterConexao(){
		
		Connection con = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsistema","root","");
			System.out.println("CONNECTION SUCCESSFULL");
		}catch(SQLException | ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("CONNECTION FAILURE");
		}
		return con;
	}

}
