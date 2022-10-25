package com.fernandopaniagua.gestorpersistencia.persistence;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.fernandopaniagua.gestorpersistencia.interfaces.IParticipantePersistence;
import com.fernandopaniagua.gestorpersistencia.model.Participante;

public class ParticipantePersistenceObjeto implements IParticipantePersistence {
	private static final String RUTA = "D:\\persisXtenciaJAVA\\";
	private static final String EXTENSION = ".part";
	
	public void add(Participante p) throws Exception {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(RUTA + p.getNombre() + EXTENSION);
			ObjectOutputStream ous = new ObjectOutputStream(fos);
			ous.writeObject(p);
		} catch (Exception ex) {
			throw ex;
		} finally {
			try {
				if (fos!=null) fos.close();
			} catch (IOException ex) {
				//No hacemos nada a propósito
			}
		}
	}
	
	
	
	
	

	public Participante find(Participante p) {
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
