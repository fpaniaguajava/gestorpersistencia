package com.fernandopaniagua.gestorpersistencia;

import com.fernandopaniagua.gestorpersistencia.interfaces.IParticipantePersistence;
import com.fernandopaniagua.gestorpersistencia.model.Participante;
import com.fernandopaniagua.gestorpersistencia.persistence.ParticipantePersistenceFactory;

public class App {

	public static void main(String[] args) {
		Participante p = new Participante("Fernando","España");
		
		IParticipantePersistence ppf = new ParticipantePersistenceFactory().createParticipantePersistence();
		try {
			ppf.add(p);
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

}
