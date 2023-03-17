package com.npb.futbol.servicios;

import java.util.List;

import com.npb.futbol.modelos.Equipo;

public interface IEquiposServicio {
	List<Equipo> findAll();
	Equipo saveEquipo(Equipo equipo);
	Equipo findEquipoById(Integer codigoEquipo);
	Equipo updateEquipo(Equipo equipo);
	String deleteEquipo(Integer codigoEquipo);
}
