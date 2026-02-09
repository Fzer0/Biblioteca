package com.fblc.bibliotecas.servicio;

import java.util.List;

import com.fblc.bibliotecas.modelo.entidad.Miembro;

public interface IMiembroServicio {

	public Miembro insertarMiembro(Miembro nuevoMiembro);
	public Miembro editarMiembro(int idMiembro);
	public void eliminarMiembro(int idMiembro);
	public List<Miembro> listarMiembro();
}
