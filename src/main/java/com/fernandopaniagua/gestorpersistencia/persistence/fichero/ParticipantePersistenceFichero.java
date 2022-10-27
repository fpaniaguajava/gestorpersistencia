package com.fernandopaniagua.gestorpersistencia.persistence.fichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.fernandopaniagua.gestorpersistencia.interfaces.IParticipantePersistence;
import com.fernandopaniagua.gestorpersistencia.model.Participante;

public class ParticipantePersistenceFichero implements IParticipantePersistence {
	private static final String RUTA = "D:\\persistenciaJAVA\\";
	private static final String EXTENSION = ".file";
	
	public void add(Participante p) throws Exception {
		PrintWriter pw = new PrintWriter(RUTA + p.getNombre() + EXTENSION);
		pw.println(p.getNombre());
		pw.println(p.getNacionalidad());
		pw.close();
	}
	
	public Participante find(String nombreABuscar) throws Exception {
		String nombre;
		String nacionalidad;
		
		FileReader fr = new FileReader(RUTA + nombreABuscar + EXTENSION);
		BufferedReader br = new BufferedReader(fr);
		nombre = br.readLine();
		nacionalidad = br.readLine();
		br.close();
		fr.close();

		Participante participanteEncontrado = new Participante(nombre,nacionalidad);
		
		return participanteEncontrado;
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
	
	public void destruirMundo() {
		
	}

}
