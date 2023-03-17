package com.npb.futbol.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npb.futbol.modelos.Jugador;
import com.npb.futbol.servicios.JugadoresServicioImpl;

@RestController
@RequestMapping("/jugadores")
public class ControladorJugador {
	@Autowired
	JugadoresServicioImpl jugadoresServicio;
	
	@GetMapping("/")
	public List<Jugador> findAllJugadores() {
		return jugadoresServicio.findAll();
	}
	
	@PostMapping("/")
	public Jugador saveJugador(@RequestBody Jugador jugador) {
		return jugadoresServicio.saveJugador(jugador);
	}
 }
