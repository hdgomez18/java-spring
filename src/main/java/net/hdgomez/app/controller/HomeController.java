package net.hdgomez.app.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.hdgomez.app.model.Pelicula;
import net.hdgomez.app.service.IPeliculasService;
import net.hdgomez.app.util.utileria;


@Controller
public class HomeController {
	
	@Autowired
	private IPeliculasService servicePeliculas;
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome() {
		return "home";
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String buscar(@RequestParam("fecha") String fecha, Model model) {
		
		List<String> listaFechas = utileria.getNextDays(4);
		
		System.out.println(listaFechas);
		
		List<Pelicula>peliculas = servicePeliculas.buscarTodas();

		model.addAttribute("fechas", listaFechas);
		model.addAttribute("fechaBusqueda", fecha);
		model.addAttribute("peliculas", peliculas);
		System.out.println(fecha);
		return "home";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String mostrarPrincipal(Model model) {
		
		List<String> listaFechas = utileria.getNextDays(4);
		
		//System.out.println(listaFechas);
		
		List<Pelicula>peliculas = servicePeliculas.buscarTodas();
	
		model.addAttribute("fechas", listaFechas);
		model.addAttribute("fechaBusqueda", dateFormat.format(new Date()));
		model.addAttribute("peliculas", peliculas);
		
		return "home";
	}
	
	@RequestMapping(value="/detail/{id}/{fecha}", method=RequestMethod.GET)
	public String mostrarDetalle(Model model, @PathVariable("id") int idPelicula,@PathVariable("fecha") String fecha) {
		
		System.out.print("idPelucula" + idPelicula);
		System.out.print("fecha" + fecha);
		model.addAttribute("pelicula", servicePeliculas.buscarPorId(idPelicula));
		return "detalle";
	}
	
	//Metodo para generar una lista de objetos de MOdelo (Pelicula)
	
	/*
	 * private List<Pelicula> getLista(){ SimpleDateFormat formatter = new
	 * SimpleDateFormat("dd-MM-yyyy"); List<Pelicula> lista = null; try { lista =
	 * new LinkedList<Pelicula>();
	 * 
	 * Pelicula pelicula1 = new Pelicula(); pelicula1.setId(1);
	 * pelicula1.setTitulo("Power Rangers"); pelicula1.setDuracion(120);
	 * pelicula1.setClasificacion("B"); pelicula1.setGenero("Aventura");
	 * pelicula1.setFechaEstreno(formatter.parse("28-12-2019"));
	 * pelicula1.setImagen("powerrangers.png"); // imagen = "cinema.png" // status =
	 * "Activa"
	 * 
	 * Pelicula pelicula2 = new Pelicula(); pelicula2.setId(2);
	 * pelicula2.setTitulo("Bad boys"); pelicula2.setDuracion(108);
	 * pelicula2.setClasificacion("C"); pelicula2.setGenero("Accion");
	 * pelicula2.setFechaEstreno(formatter.parse("13-01-2020"));
	 * pelicula2.setImagen("badboys.jpg");
	 * 
	 * Pelicula pelicula3 = new Pelicula(); pelicula3.setId(3);
	 * pelicula3.setTitulo("Parasito"); pelicula3.setDuracion(102);
	 * pelicula3.setClasificacion("C"); pelicula3.setGenero("Terror");
	 * pelicula3.setFechaEstreno(formatter.parse("02-02-2020"));
	 * pelicula3.setImagen("parasite.jpg");
	 * 
	 * Pelicula pelicula4 = new Pelicula(); pelicula4.setId(4);
	 * pelicula4.setTitulo("rapido y furioso"); pelicula4.setDuracion(130);
	 * pelicula4.setClasificacion("C"); pelicula4.setGenero("Acción");
	 * pelicula4.setFechaEstreno(formatter.parse("04-05-2020"));
	 * pelicula4.setEstatus("Inactiva");
	 * 
	 * Pelicula pelicula5 = new Pelicula(); pelicula5.setId(5);
	 * pelicula5.setTitulo("Life vida inteligente"); pelicula5.setDuracion(118);
	 * pelicula5.setClasificacion("A"); pelicula5.setGenero("Drama");
	 * pelicula5.setFechaEstreno(formatter.parse("16-02-2020"));
	 * pelicula5.setEstatus("Inactiva"); pelicula5.setImagen("estreno5.png");
	 * 
	 * //agragar los objetos Pelicula a la lista
	 * 
	 * lista.add(pelicula1); lista.add(pelicula2); lista.add(pelicula3);
	 * lista.add(pelicula4); lista.add(pelicula5);
	 * 
	 * return lista;
	 * 
	 * 
	 * }catch(ParseException e) { System.out.println("Error "+ e.getMessage());
	 * return null; }
	 * 
	 * 
	 * 
	 * }
	 */
	

}
