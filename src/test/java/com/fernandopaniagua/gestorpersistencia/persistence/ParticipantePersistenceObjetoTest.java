package com.fernandopaniagua.gestorpersistencia.persistence;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.fernandopaniagua.gestorpersistencia.model.Participante;
import com.fernandopaniagua.gestorpersistencia.persistence.objectstream.ParticipantePersistenceObjeto;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParticipantePersistenceObjetoTest {

	@Test
	public void crearParticipante() {
		ParticipantePersistenceObjeto ppf = new ParticipantePersistenceObjeto();
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
		ParticipantePersistenceObjeto ppf = new ParticipantePersistenceObjeto();
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
