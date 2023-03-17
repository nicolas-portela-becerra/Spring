package com.npb.futbol.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Equipo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo_equipo;
	@Column
	private String nombre;
	
	public Integer getCodigo() {
		return codigo_equipo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo_equipo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Equipo [codigo=" + codigo_equipo + ", nombre=" + nombre + "]";
	}
}
