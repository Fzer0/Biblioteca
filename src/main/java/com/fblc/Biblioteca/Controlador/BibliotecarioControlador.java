package com.fblc.Biblioteca.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fblc.bibliotecas.modelo.entidad.Bibliotecario;
import com.fblc.bibliotecas.servicio.IBibliotecarioServicio;

@RestController
@RequestMapping("/api/bibliotecario")
public class BibliotecarioControlador {

	@Autowired
	private IBibliotecarioServicio servicioBibliotecario;
	
	@GetMapping
	public List <Bibliotecario> listarBibliotecario(){
		return servicioBibliotecario.listarBibliotecario();
	}
	
	@PostMapping
	public Bibliotecario crearBibliotecario(@RequestBody Bibliotecario bibliotecario) {
		return servicioBibliotecario.insertarBibliotecario(bibliotecario);				
	}
	@GetMapping("/{id}")
	public Bibliotecario editarBibliotecario(@PathVariable int id) {
		return servicioBibliotecario.editarBibliotecario(id);
		
	}
	
	@DeleteMapping("/{id}")
	public void eliminarBibliotecario(@PathVariable int id) {
		servicioBibliotecario.eliminarBibliotecario(id);
	}
}
