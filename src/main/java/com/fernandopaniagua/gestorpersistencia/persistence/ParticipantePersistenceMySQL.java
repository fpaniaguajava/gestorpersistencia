package com.fernandopaniagua.gestorpersistencia.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fernandopaniagua.gestorpersistencia.interfaces.IParticipantePersistence;
import com.fernandopaniagua.gestorpersistencia.model.Participante;

public class ParticipantePersistenceMySQL implements IParticipantePersistence {
	public static final String HOST_NAME = "localhost";
	public static final String PORT = "3306";
	public static final String DB_NAME = "peliculasdb";
	public static final String USER_NAME = "usuarioapp";
	public static final String USER_PASSWORD = "patata";
		
	private Connection conexion = null;
	private void setConnection() throws Exception{
		String servidor = String.format("jdbc:mysql://%s:%s/%s",HOST_NAME, PORT, DB_NAME);
		this.conexion = DriverManager.getConnection(servidor, USER_NAME, USER_PASSWORD);
		System.out.println("Conexión establecida");
	}
	
	private void closeConnection() throws Exception {
		this.conexion.close();
	}
	
	public void add(Participante p) throws Exception {
		setConnection();
		
		String sql = 
				String.format("INSERT INTO participantes(nombre, nacionalidad) VALUES ('%s','%s')",p.getNombre(),p.getNacionalidad());
		Statement st = conexion.createStatement();
		st.executeUpdate(sql);
		closeConnection();
	}
	
	public Participante find(String nombre) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Participante> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Participante p) {
		// TODO Auto-generated method stub

	}

	public void delete(Participante p) {
		// TODO Auto-generated method stub

	}

}
