package com.fblc.bibliotecas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fblc.bibliotecas.modelo.entidad.Bibliotecario;
import com.fblc.bibliotecas.repositorio.IBibliotecarioRepositorio;
import com.fblc.bibliotecas.servicio.IBibliotecarioServicio;

@Service
@Component
public class BibliotecarioServicioImpl implements IBibliotecarioServicio {

	@Autowired
	public IBibliotecarioRepositorio repositorioBibliotecario;
		
	
	@Override
    public Bibliotecario insertarBibliotecario(Bibliotecario nuevoBibliotecario) {
		// TODO Auto-generated method stub
        return repositorioBibliotecario.save(nuevoBibliotecario);
    }

    @Override
    public Bibliotecario editarBibliotecario(int idBibliotecario) {
    	// TODO Auto-generated method stub
        return repositorioBibliotecario.findById(idBibliotecario).orElse(null);
    }

    @Override
    public void eliminarBibliotecario(int idBibliotecario) {
    	// TODO Auto-generated method stub
        repositorioBibliotecario.deleteById(idBibliotecario);
    }

    @Override
    public List<Bibliotecario> listarBibliotecario() {
    	// TODO Auto-generated method stub
        return repositorioBibliotecario.findAll();
    }
}
