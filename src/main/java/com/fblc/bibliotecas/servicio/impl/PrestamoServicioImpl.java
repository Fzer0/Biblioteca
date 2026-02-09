package com.fblc.bibliotecas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fblc.bibliotecas.modelo.entidad.Prestamo;
import com.fblc.bibliotecas.repositorio.IPrestamoRepositorio;
import com.fblc.bibliotecas.servicio.IPrestamoServicio;

@Service
@Component
public class PrestamoServicioImpl implements IPrestamoServicio {

	@Autowired
	public IPrestamoRepositorio repositorioPrestamo;
	 {

}
	 @Override
	 public Prestamo insertarPrestamo(Prestamo nuevoPrestamo) {
		// TODO Auto-generated method stub
		return repositorioPrestamo.save(nuevoPrestamo);
	 }
	 @Override
	 public Prestamo editarPrestamo(int idPrestamo) {
		// TODO Auto-generated method stub
		return repositorioPrestamo.findById(idPrestamo).get();
	 }
	 @Override
	 public void eliminarPrestamo(int idPrestamo) {
		// TODO Auto-generated method stub
		repositorioPrestamo.delete(editarPrestamo(idPrestamo));
	 }
	 @Override
	 public List<Prestamo> listarPrestamo() {
		// TODO Auto-generated method stub
		return repositorioPrestamo.findAll();
	 }
}
