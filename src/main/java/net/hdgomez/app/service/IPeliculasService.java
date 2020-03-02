package net.hdgomez.app.service;

import java.util.List;

import net.hdgomez.app.model.Pelicula;

public interface IPeliculasService {
	void insertar(Pelicula pelicula);
	List<Pelicula> buscarTodas();
	Pelicula buscarPorId(int idPelicula);
	

}
