package com.fernandopaniagua.gestorpersistencia.persistence;

import java.io.FileInputStream;
import java.util.Properties;

import com.fernandopaniagua.gestorpersistencia.interfaces.IParticipantePersistence;

public class ParticipantePersistenceFactory {
	private static final String FICHERO_PROPERTIES = "D:\\persistenciaJAVA\\configuracion.xml";
	private static final String PROPIEDAD_TIPO_PERSISTENCIA = "persistencia";
	
	private static final int PERSISTENCIA_FICHERO = 1;
	private static final int PERSISTENCIA_OBJETOS = 2;
	private static final int PERSISTENCIA_MYSQL = 3;
	
	public int getTipoPersistencia() throws Exception {
		Properties properties = new Properties();
		properties.loadFromXML(new FileInputStream(FICHERO_PROPERTIES));
		Integer tipo = Integer.parseInt(properties.getProperty(PROPIEDAD_TIPO_PERSISTENCIA));
		return tipo;
	}
	
	public IParticipantePersistence createParticipantePersistence() throws Exception {
		int tipoPersistencia = this.getTipoPersistencia();
		switch (tipoPersistencia) {
			case PERSISTENCIA_FICHERO:
				return new ParticipantePersistenceFichero();
			case PERSISTENCIA_OBJETOS:
				return new ParticipantePersistenceObjeto();
			case PERSISTENCIA_MYSQL:
				return new ParticipantePersistenceMySQL();
			default: 
				return new ParticipantePersistenceFichero();
		}
	}
}