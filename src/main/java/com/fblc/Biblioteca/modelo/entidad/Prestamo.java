package com.fblc.Biblioteca.modelo.entidad;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import java.time.LocalDate;


@Entity
@Data
public class Prestamo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prestamo;
	
	private LocalDate fecha_prestamo;
	private LocalDate fecha_devolucion;
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
