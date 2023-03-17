package com.npb.futbol.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npb.futbol.modelos.Jugador;
import com.npb.futbol.repositorio.JugadorRepositorio;

@Service
public class JugadoresServicioImpl implements IJugadoresServicio {
	@Autowired
	JugadorRepositorio jugadorRepo;
	@Override
	public List<Jugador> findAll() {
		return jugadorRepo.findAll();
	}

	@Override
	public Jugador saveJugador(Jugador jugador) {
		return jugadorRepo.save(jugador);
	}

	@Override
	public void deleteJugador(int id) {
		jugadorRepo.deleteById(id);
		
	}

	@Override
	public Jugador findById(int id) {
		return jugadorRepo.getReferenceById(id);
	}

}
