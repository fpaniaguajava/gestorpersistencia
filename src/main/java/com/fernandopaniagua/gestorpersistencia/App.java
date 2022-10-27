package com.fernandopaniagua.gestorpersistencia;

import com.fernandopaniagua.gestorpersistencia.interfaces.IParticipantePersistence;
import com.fernandopaniagua.gestorpersistencia.model.Participante;
import com.fernandopaniagua.gestorpersistencia.persistence.ParticipantePersistenceFactory;

public class App {

	public static void main(String[] args) {
		Participante p = new Participante("Miguel","Brasil");
		
		try {
			//Versión extendida
			//ParticipantePersistenceFactory ppf = new ParticipantePersistenceFactory();
			//IParticipantePersistence pp = ppf.createParticipantePersistence();
			
			//Versión compacta
			IParticipantePersistence pp = new ParticipantePersistenceFactory().createParticipantePersistence();
			pp.add(p);
			System.out.println("Participante agregado correctamente...");
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

}
