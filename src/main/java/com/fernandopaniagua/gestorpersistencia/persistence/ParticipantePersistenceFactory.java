package com.fernandopaniagua.gestorpersistencia.persistence;

import com.fernandopaniagua.gestorpersistencia.interfaces.IParticipantePersistence;

public class ParticipantePersistenceFactory {
	public IParticipantePersistence createParticipantePersistence() {
		return new ParticipantePersistenceObjeto();
	}
}
