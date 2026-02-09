package com.fblc.bibliotecas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.fblc.bibliotecas.modelo.entidad.Catalogo;

@Repository
@Component
public interface ICatalogoRepositorio extends JpaRepository<Catalogo, Integer> {



}
