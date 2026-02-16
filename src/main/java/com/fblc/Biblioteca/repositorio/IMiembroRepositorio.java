package com.fblc.Biblioteca.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.fblc.Biblioteca.modelo.entidad.Miembro;



@Repository
@Component
public interface IMiembroRepositorio extends JpaRepository<Miembro, Integer> {

}
