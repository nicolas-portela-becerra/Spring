package com.npb.futbol.servicios;

import java.util.List;

import com.npb.futbol.modelos.Jugador;

public interface IJugadoresServicio {
	List<Jugador> findAll();
	Jugador saveJugador(Jugador jugador);
}
