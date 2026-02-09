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
import com.fblc.bibliotecas.modelo.entidad.Libro;
import com.fblc.bibliotecas.modelo.entidad.Miembro;
import com.fblc.bibliotecas.modelo.entidad.Prestamo;
import com.fblc.bibliotecas.servicio.IBibliotecarioServicio;
import com.fblc.bibliotecas.servicio.ILibroServicio;
import com.fblc.bibliotecas.servicio.IMiembroServicio;
import com.fblc.bibliotecas.servicio.IPrestamoServicio;

@RestController
@RequestMapping("/api/prestamo")
public class PrestamoControlador {

	@Autowired
    private IPrestamoServicio servicioPrestamo;

    @Autowired
    private ILibroServicio servicioLibro;

    @Autowired
    private IMiembroServicio servicioMiembro;

    @Autowired
    private IBibliotecarioServicio servicioBibliotecario;

    @GetMapping
    public List<Prestamo> listarPrestamo() {
        return servicioPrestamo.listarPrestamo();
    }

    @PostMapping
    public Prestamo insertarPrestamo(@RequestBody Prestamo prestamo) {

        if (prestamo.getFkIdLibro() != null &&
            prestamo.getFkIdLibro().getId_libro() > 0 &&
            prestamo.getFkIdMiembro() != null &&
            prestamo.getFkIdMiembro().getId_miembro() > 0 &&
            prestamo.getFkIdBibliotecario() != null &&
            prestamo.getFkIdBibliotecario().getId_bibliotecario() > 0) {

            Libro libro = servicioLibro.editarLibro(
                    prestamo.getFkIdLibro().getId_libro());

            Miembro miembro = servicioMiembro.editarMiembro(
                    prestamo.getFkIdMiembro().getId_miembro());

            Bibliotecario bibliotecario = servicioBibliotecario.editarBibliotecario(
                    prestamo.getFkIdBibliotecario().getId_bibliotecario());

            if (libro != null) {
                prestamo.setFkIdLibro(libro);
            } else {
                throw new RuntimeException("El libro no existe");
            }

            if (miembro != null) {
                prestamo.setFkIdMiembro(miembro);
            } else {
                throw new RuntimeException("El miembro no existe");
            }

            if (bibliotecario != null) {
                prestamo.setFkIdBibliotecario(bibliotecario);
            } else {
                throw new RuntimeException("El bibliotecario no existe");
            }

        } else {
            throw new RuntimeException("Faltan datos: libro, miembro o bibliotecario");
        }

        return servicioPrestamo.insertarPrestamo(prestamo);
    }

    @GetMapping("/{id}")
    public Prestamo obtenerPrestamo(@PathVariable int id) {
        return servicioPrestamo.editarPrestamo(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarPrestamo(@PathVariable int id) {
        servicioPrestamo.eliminarPrestamo(id);
    }
}