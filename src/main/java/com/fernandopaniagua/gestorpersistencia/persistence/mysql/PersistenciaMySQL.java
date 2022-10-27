package com.fernandopaniagua.gestorpersistencia.persistence.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class PersistenciaMySQL {
	protected static final String HOST_NAME = "localhost";
	protected static final String PORT = "3306";
	protected static final String DB_NAME = "peliculasdb";
	protected static final String USER_NAME = "usuarioapp";
	protected static final String USER_PASSWORD = "patata";
	
	protected Connection conexion = null;
	protected void setConnection() throws Exception{
		String servidor = String.format("jdbc:mysql://%s:%s/%s",HOST_NAME, PORT, DB_NAME);
		this.conexion = DriverManager.getConnection(servidor, USER_NAME, USER_PASSWORD);
		System.out.println("Conexión establecida");
	}
	
	protected void closeConnection() throws Exception {
		this.conexion.close();
	}
}
