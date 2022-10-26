package com.fernandopaniagua.gestorpersistencia.persistence;

import static org.junit.Assert.*;
import org.junit.runners.MethodSorters;

import org.junit.FixMethodOrder;
import org.junit.Test;

import com.fernandopaniagua.gestorpersistencia.model.Participante;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParticipantePersistenceFicheroTest {
	
	@Test
	public void crearParticipante() {
		ParticipantePersistenceFichero ppf = new ParticipantePersistenceFichero();
		Participante p = new Participante("Charlize","South Africa");
		try {
			ppf.add(p);
		} catch (Exception e) {
			fail("Error al crear participante " + e.getMessage());
		}
	}
	
	@Test
	public void fakeTest() {
		//No hago nada
	}
	
	@Test
	public void leerParticipante() {
		ParticipantePersistenceFichero ppf = new ParticipantePersistenceFichero();
		String nombre = "Charlize";
		try {
			Participante participanteEncontrado = ppf.find(nombre);
			assertEquals(nombre, participanteEncontrado.getNombre());
			assertEquals("South Africa", participanteEncontrado.getNacionalidad());
		} catch (Exception e) {
			fail("Error al buscar un participante " + e.getMessage());
		}
	}
	
	

}
