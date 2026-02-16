package com.fblc.Biblioteca.servicio;

import java.util.List;

import com.fblc.Biblioteca.modelo.entidad.Miembro;



public interface IMiembroServicio {

	public Miembro insertarMiembro(Miembro nuevoMiembro);
	public Miembro editarMiembro(int idMiembro);
	public void eliminarMiembro(int idMiembro);
	public List<Miembro> listarMiembro();
}
