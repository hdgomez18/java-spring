package net.hdgomez.app.service;

import org.springframework.stereotype.Service;

import net.hdgomez.app.model.Noticia;

@Service

public class NoticiasServiceImpl implements INoticiasService {

	// Constructor vacio. Unicamente para imprimir un mensaje al crearse una
	// instancia
	public NoticiasServiceImpl() {
		System.out.println("Creando una instancia de la clase NoticiasServiceImpl");
	}

	public void guardar(Noticia noticia) {
		System.out.println(noticia);

	}

}
