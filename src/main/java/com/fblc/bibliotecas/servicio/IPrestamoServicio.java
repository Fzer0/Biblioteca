package com.fblc.bibliotecas.servicio;

import java.util.List;

import com.fblc.bibliotecas.modelo.entidad.Prestamo;

public interface IPrestamoServicio {

	public Prestamo insertarPrestamo(Prestamo nuevoPrestamo);
	public Prestamo editarPrestamo(int idPrestamo);
	public void eliminarPrestamo(int idPrestamo);
	public List<Prestamo> listarPrestamo();
}
