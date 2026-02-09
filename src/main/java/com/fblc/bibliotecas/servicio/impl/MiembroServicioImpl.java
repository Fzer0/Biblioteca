package com.fblc.bibliotecas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fblc.bibliotecas.modelo.entidad.Miembro;
import com.fblc.bibliotecas.repositorio.IMiembroRepositorio;
import com.fblc.bibliotecas.servicio.IMiembroServicio;

@Service
@Component
public class MiembroServicioImpl implements IMiembroServicio{
		
	@Autowired
	public IMiembroRepositorio repositorioMiembro;

	@Override
	public Miembro insertarMiembro(Miembro nuevoMiembro) {
		// TODO Auto-generated method stub
		return repositorioMiembro.save(nuevoMiembro);
	}

	@Override
	public Miembro editarMiembro(int idMiembro) {
		// TODO Auto-generated method stub
		return repositorioMiembro.findById(idMiembro).get();
	}

	@Override
	public void eliminarMiembro(int idMiembro) {
		// TODO Auto-generated method stub
		repositorioMiembro.delete(editarMiembro(idMiembro));
		
	}

	@Override
	public List<Miembro> listarMiembro() {
		// TODO Auto-generated method stub
		return repositorioMiembro.findAll();
	}
	

}
