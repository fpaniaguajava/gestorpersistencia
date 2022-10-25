package com.fernandopaniagua.gestorpersistencia.model;

import java.util.ArrayList;

public class Pelicula {
	private String titulo;
	private Participante director;
	private String sinopsis;
	private ArrayList<Participante> actores;
	
	public Pelicula(String titulo, Participante director, String sinopsis, ArrayList<Participante> actores) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.sinopsis = sinopsis;
		this.actores = actores;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Participante getDirector() {
		return director;
	}
	public void setDirector(Participante director) {
		this.director = director;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public ArrayList<Participante> getActores() {
		return actores;
	}
	public void setActores(ArrayList<Participante> actores) {
		this.actores = actores;
	}
	
	
}
