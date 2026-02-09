package com.fblc.bibliotecas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.fblc.bibliotecas.modelo.entidad.Prestamo;

@Repository
@Component
public interface IPrestamoRepositorio extends JpaRepository<Prestamo, Integer> {

}
