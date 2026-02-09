package com.fblc.bibliotecas.servicio;

import java.util.List;

import com.fblc.bibliotecas.modelo.entidad.Bibliotecario;

public interface IBibliotecarioServicio {

	public Bibliotecario insertarBibliotecario(Bibliotecario nuevoBibliotecario);
	public 	Bibliotecario editarBibliotecario(int idBibliotecario);
	public void eliminarBibliotecario(int idBibliotecario);
	public List<Bibliotecario> listarBibliotecario();
	
	
}
