package com.fblc.bibliotecas.modelo.entidad;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Bibliotecario implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_bibliotecario;
	private String nombre_biblioteca;
	private String direccion_biblioteca;
	private String telefono_biblioteca;
}
