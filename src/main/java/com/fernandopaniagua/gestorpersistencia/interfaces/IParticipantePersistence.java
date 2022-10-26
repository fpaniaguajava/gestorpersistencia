package com.fernandopaniagua.gestorpersistencia.interfaces;

import java.util.ArrayList;

import com.fernandopaniagua.gestorpersistencia.model.Participante;

public interface IParticipantePersistence {
	//CRUD Create-Read-Update-Delete
	public void add(Participante p) throws Exception;
	public Participante find(String nombre) throws Exception;
	public ArrayList<Participante> findAll();
	public void update(Participante p);
	public void delete(Participante p);
}