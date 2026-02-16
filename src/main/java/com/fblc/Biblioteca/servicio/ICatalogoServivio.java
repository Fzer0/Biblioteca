package com.fblc.Biblioteca.servicio;

import java.util.List;

import com.fblc.Biblioteca.modelo.entidad.Catalogo;



public interface ICatalogoServivio {

public Catalogo insertarCatalogo (Catalogo nuevoCatalogo);
public Catalogo editarCatalogo (int idCatalogo);
public void eliminarCatalogo(int idCatalogo);
public List<Catalogo> listarCatalogo();
}
