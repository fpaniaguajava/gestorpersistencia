package com.fernandopaniagua.gestorpersistencia.persistence.mysql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.fernandopaniagua.gestorpersistencia.interfaces.IParticipantePersistence;
import com.fernandopaniagua.gestorpersistencia.model.Participante;

//CRUD sobre MySQL
public class ParticipantePersistenceMySQL extends PersistenciaMySQL implements IParticipantePersistence {

	public void add(Participante p) throws Exception {
		setConnection();

		String sql = String.format("INSERT INTO participantes(nombre, nacionalidad) VALUES ('%s','%s')", p.getNombre(),
				p.getNacionalidad());
		Statement st = conexion.createStatement();
		st.executeUpdate(sql);

		closeConnection();
	}

	public Participante find(String nombre) throws Exception {
		Participante p;

		setConnection();

		String sql = "SELECT * from participantes where nombre=?";
		PreparedStatement ps;
		ps = conexion.prepareStatement(sql);
		ps.setString(1, nombre);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			p = new Participante(rs.getString("nombre"), rs.getString("nacionalidad"));
		} else {
			closeConnection();
			throw new Exception("El registro no se ha encontrado");
		}
		rs.close();
		ps.close();

		closeConnection();
		return p;
	}

	public ArrayList<Participante> findAll() throws Exception {
		ArrayList<Participante> participantes = new ArrayList<Participante>();

		setConnection();

		String sql = "SELECT * from participantes";
		Statement s = conexion.createStatement();
		
		ResultSet rs = s.executeQuery(sql);
		while (rs.next()) {
			Participante p = new Participante(rs.getString("nombre"), rs.getString("nacionalidad"));
			participantes.add(p);
		}
		rs.close();
		s.close();

		closeConnection();
		return participantes;
	}
	
	/*
	 * TODO Implementar esta funcionalidad
	public ArrayList<Participante> findByNacionalidad(String nacionalidad) throws Exception {
		
	}
	*/

	public void update(Participante p) throws Exception {
		setConnection();

		String sql = String.format("UPDATE participantes set nacionalidad='%s' where nombre='%s'", p.getNacionalidad(),
				p.getNombre());
		Statement st = conexion.createStatement();
		st.executeUpdate(sql);

		closeConnection();
	}

	public void delete(Participante p) throws Exception {
		setConnection();

		String sql = String.format("DELETE FROM participantes where nombre='%s'", p.getNombre());
		Statement st = conexion.createStatement();
		st.executeUpdate(sql);

		closeConnection();
	}
	
	public static void main(String[] args) {
		try {
			new ParticipantePersistenceMySQL().findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
