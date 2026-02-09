package com.fblc.bibliotecas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fblc.bibliotecas.modelo.entidad.Catalogo;
import com.fblc.bibliotecas.repositorio.ICatalogoRepositorio;
import com.fblc.bibliotecas.servicio.ICatalogoServivio;

@Service
@Component
public class CatalogoServicioImpl implements ICatalogoServivio{

	@Autowired
	public ICatalogoRepositorio repositorioCatalogo;

	@Override
	public Catalogo insertarCatalogo(Catalogo nuevoCatalogo) {
		// TODO Auto-generated method stub
		return repositorioCatalogo.save(nuevoCatalogo);
	}

	@Override
	public Catalogo editarCatalogo(int idCatalogo) {
		// TODO Auto-generated method stub
		return repositorioCatalogo.findById(idCatalogo).get();
	}

	@Override
	public void eliminarCatalogo(int idCatalogo) {
		// TODO Auto-generated method stub
		repositorioCatalogo.delete(editarCatalogo(idCatalogo));
	}

	@Override
	public List<Catalogo> listarCatalogo() {
		// TODO Auto-generated method stub
		return repositorioCatalogo.findAll();
	}
	

}
