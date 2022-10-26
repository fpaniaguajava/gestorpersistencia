package com.fernandopaniagua.gestorpersistencia.interfaces;

import com.fernandopaniagua.gestorpersistencia.model.Pelicula;
import java.util.ArrayList;

public interface IPeliculaPersistence {
	//CRUD Create-Read-Update-Delete
	public void add(Pelicula p) throws Exception;
	public Pelicula find(Pelicula p);
	public ArrayList<Pelicula> findAll();
	public void update(Pelicula p);
	public void delete(Pelicula p);
}