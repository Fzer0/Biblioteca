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

import com.fblc.bibliotecas.modelo.entidad.Catalogo;
import com.fblc.bibliotecas.servicio.ICatalogoServivio;

@RestController
@RequestMapping("/api/catalogo")
public class CatalogoControlador {

	@Autowired
	private ICatalogoServivio servicioCatalogo;
	
	@GetMapping
	public List <Catalogo> listarCatalogo(){
		return servicioCatalogo.listarCatalogo();
	}
	
	@PostMapping
	public Catalogo crearCatalogo(@RequestBody Catalogo catalogo) {
		return servicioCatalogo.insertarCatalogo(catalogo);				
	}
	@GetMapping("/{id}")
	public Catalogo editarCatalogo(@PathVariable int id) {
		return servicioCatalogo.editarCatalogo(id);
		
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCatalogo(@PathVariable int id) {
		servicioCatalogo.eliminarCatalogo(id);
	}
}
