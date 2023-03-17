package com.npb.futbol.modelos;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Equipo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo_equipo;
	@Column
	private String nombre;
	

	public Integer getCodigo_equipo() {
		return codigo_equipo;
	}
	public void setCodigo_equipo(Integer codigo_equipo) {
		this.codigo_equipo = codigo_equipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Equipo [codigo_equipo=" + codigo_equipo + ", nombre=" + nombre + "]";
	}
}
