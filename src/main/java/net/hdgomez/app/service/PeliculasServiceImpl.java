package net.hdgomez.app.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.hdgomez.app.model.Pelicula;

@Service

public class PeliculasServiceImpl implements IPeliculasService {

	
	private List<Pelicula> lista = null;
	
	public PeliculasServiceImpl() {
		
		System.out.println("creando una instancia de la clase peliculas serviceimplt");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			lista = new LinkedList<Pelicula>();
			
			Pelicula pelicula1 = new Pelicula();
			pelicula1.setId(1);
			pelicula1.setTitulo("Power Rangers");
			pelicula1.setDuracion(120);
			pelicula1.setClasificacion("B");
			pelicula1.setGenero("Aventura");
			pelicula1.setFechaEstreno(formatter.parse("28-12-2019"));
			pelicula1.setImagen("powerrangers.png");
			// imagen = "cinema.png"
			// status = "Activa"
			
			Pelicula pelicula2 = new Pelicula();
			pelicula2.setId(2);
			pelicula2.setTitulo("Bad boys");
			pelicula2.setDuracion(108);
			pelicula2.setClasificacion("C");
			pelicula2.setGenero("Accion");
			pelicula2.setFechaEstreno(formatter.parse("13-01-2020"));
			pelicula2.setImagen("badboys.jpg");
			
			Pelicula pelicula3 = new Pelicula();
			pelicula3.setId(3);
			pelicula3.setTitulo("Parasito");
			pelicula3.setDuracion(102);
			pelicula3.setClasificacion("C");
			pelicula3.setGenero("Terror");
			pelicula3.setFechaEstreno(formatter.parse("02-02-2020"));
			pelicula3.setImagen("parasite.jpg");
			
			Pelicula pelicula4 = new Pelicula();
			pelicula4.setId(4);
			pelicula4.setTitulo("rapido y furioso");
			pelicula4.setDuracion(130);
			pelicula4.setClasificacion("C");
			pelicula4.setGenero("Acción");
			pelicula4.setFechaEstreno(formatter.parse("04-05-2020"));
			pelicula4.setEstatus("Inactiva");
			
			Pelicula pelicula5 = new Pelicula();
			pelicula5.setId(5);
			pelicula5.setTitulo("Life vida inteligente");
			pelicula5.setDuracion(118);
			pelicula5.setClasificacion("A");
			pelicula5.setGenero("Drama");
			pelicula5.setFechaEstreno(formatter.parse("16-02-2020"));
			pelicula5.setEstatus("Inactiva");
			pelicula5.setImagen("estreno5.png");
			
			//agragar los objetos Pelicula a la lista
			
			lista.add(pelicula1);
			lista.add(pelicula2);
			lista.add(pelicula3);
			lista.add(pelicula4);
			lista.add(pelicula5);
			
		

			
		}catch(ParseException e) {
			System.out.println("Error "+ e.getMessage());
			
		}
	}
	
	public List<Pelicula> buscarTodas() {
		
		return lista;
	}

	public Pelicula buscarPorId(int idPelicula) {
		for (Pelicula p: lista) {
			if(p.getId()==idPelicula) {
				return p;
			}
		}
		return null;
	}

	public void insertar(Pelicula pelicula) {
		lista.add(pelicula);
		
	}
	


}
