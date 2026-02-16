package com.fblc.Biblioteca.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fblc.Biblioteca.modelo.entidad.Bibliotecario;
import com.fblc.Biblioteca.repositorio.IBibliotecarioRepositorio;
import com.fblc.Biblioteca.servicio.IBibliotecarioServicio;



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
