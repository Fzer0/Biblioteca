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

import com.fblc.Biblioteca.modelo.entidad.Miembro;
import com.fblc.Biblioteca.servicio.IMiembroServicio;

@RestController
@RequestMapping("/api/miembro")
public class MiembroControlador {

	@Autowired
	private IMiembroServicio servicioMiembro;
	
	@GetMapping
	public List <Miembro> listarMiembro(){
		return servicioMiembro.listarMiembro();
	}
	
	@PostMapping
	public Miembro crearMiembro(@RequestBody Miembro miembro) {
		return servicioMiembro.insertarMiembro(miembro);				
	}
	@GetMapping("/{id}")
	public Miembro editarMiembro(@PathVariable int id) {
		return servicioMiembro.editarMiembro(id);
		
	}
	
	@DeleteMapping("/{id}")
	public void eliminarMiembro(@PathVariable int id) {
		servicioMiembro.eliminarMiembro(id);
	}
}
