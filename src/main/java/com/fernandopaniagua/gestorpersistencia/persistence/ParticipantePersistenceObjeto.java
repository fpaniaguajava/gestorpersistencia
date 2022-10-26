package com.fernandopaniagua.gestorpersistencia.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.fernandopaniagua.gestorpersistencia.interfaces.IParticipantePersistence;
import com.fernandopaniagua.gestorpersistencia.model.Participante;

public class ParticipantePersistenceObjeto implements IParticipantePersistence {
	private static final String RUTA = "D:\\persistenciaJAVA\\";
	private static final String EXTENSION = ".obj";
	
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

	public Participante find(String nombre) throws Exception {
		Participante participante;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(RUTA + nombre + EXTENSION);
			ObjectInputStream ois = new ObjectInputStream(fis);
			participante = (Participante)ois.readObject();
		} catch (Exception ex) {
			throw ex;
		} finally {
			try {
				if (fis!=null) fis.close();
			} catch (IOException ex) {
				//No hacemos nada a propósito
			}
		}
		return participante;
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
