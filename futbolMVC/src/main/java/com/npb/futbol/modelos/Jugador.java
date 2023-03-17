package com.npb.futbol.modelos;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Jugador {
	@Id
	private int codigo_jugador;
	@Column
	private String nombre;
	@Column
	private Date fechaNacimiento;
	@Column
	@Enumerated(EnumType.STRING)
	private Posiciones posicion;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "equipo")
	private Equipo equipo;
	
	@Override
	public String toString() {
		return "Jugador [codigo_jugador=" + codigo_jugador + ", nombre=" + nombre + ", fechaNacimiento="
				+ fechaNacimiento + ", posicion=" + posicion.toString() + ", equipo=" + equipo + "]";
	}

	public int getCodigo_jugador() {
		return codigo_jugador;
	}

	public void setCodigo_jugador(int codigo_jugador) {
		this.codigo_jugador = codigo_jugador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Posiciones getPosicion() {
		return posicion;
	}

	public void setPosicion(Posiciones posicion) {
		this.posicion = posicion;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
}
