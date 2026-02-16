package com.fblc.Biblioteca.servicio;

import java.util.List;

import com.fblc.Biblioteca.modelo.entidad.Prestamo;



public interface IPrestamoServicio {

	public Prestamo insertarPrestamo(Prestamo nuevoPrestamo);
	public Prestamo editarPrestamo(int idPrestamo);
	public void eliminarPrestamo(int idPrestamo);
	public List<Prestamo> listarPrestamo();
}
