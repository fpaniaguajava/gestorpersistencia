package com.fernandopaniagua.gestorpersistencia.interfaces;

import java.util.ArrayList;

import com.fernandopaniagua.gestorpersistencia.model.Participante;

public interface IParticipantePersistence {
	//CRUD Create-Read-Update-Delete
	public void add(Participante p) throws Exception;
	public Participante find(String nombre) throws Exception;
	public ArrayList<Participante> findAll() throws Exception;
	public void update(Participante p) throws Exception;
	public void delete(Participante p) throws Exception;
}