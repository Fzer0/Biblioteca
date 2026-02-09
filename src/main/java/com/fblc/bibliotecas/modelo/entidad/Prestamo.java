package com.fblc.bibliotecas.modelo.entidad;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Prestamo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prestamo;
	
	private Data fecha_prestamo;
	private Data fecha_devolucion;
	private String estado_prestamo;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fkIdLibro", nullable = false)
    private Libro fkIdLibro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fkIdMiembro", nullable = false)
    private Miembro fkIdMiembro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fkIdBibliotecario", nullable = false)
    private Bibliotecario fkIdBibliotecario;
}
