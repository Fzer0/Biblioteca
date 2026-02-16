package com.fblc.Biblioteca.servicio;

import java.util.List;

import com.fblc.Biblioteca.modelo.entidad.Libro;



public interface ILibroServicio {

	public Libro insertarLibro(Libro nuevoLibro);
	public Libro editarLibro(int idLibro);
	public void eliminarLibro(int idLibro);
	public List<Libro> listarLibro();
	
}
