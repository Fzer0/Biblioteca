package com.fblc.bibliotecas.servicio;

import java.util.List;

import com.fblc.bibliotecas.modelo.entidad.Catalogo;

public interface ICatalogoServivio {

public Catalogo insertarCatalogo (Catalogo nuevoCatalogo);
public Catalogo editarCatalogo (int idCatalogo);
public void eliminarCatalogo(int idCatalogo);
public List<Catalogo> listarCatalogo();
}
