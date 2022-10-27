package com.fernandopaniagua.gestorpersistencia.model;

import java.io.Serializable;

public class Participante extends Object implements Serializable {
	private String nombre;
	private String nacionalidad;
	
	public Participante(String nombre) {
		super();
		this.nombre = nombre;
		this.nacionalidad = "Desconocida";
	}
	public Participante(String nombre, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	@Override
	public String toString() {
		return String.format("Nombre:%s - Nacionalidad:%s", this.nombre, this.nacionalidad);
	}
}

