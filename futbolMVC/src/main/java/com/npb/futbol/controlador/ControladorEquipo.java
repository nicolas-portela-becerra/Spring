package com.npb.futbol.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npb.futbol.modelos.Equipo;
import com.npb.futbol.servicios.EquiposServicioImpl;

@RestController
@RequestMapping("/equipos")
public class ControladorEquipo {
	@Autowired
	EquiposServicioImpl equipoServicio;
	
	@GetMapping("/")
	public List<Equipo> getAllEquipos() {
		return equipoServicio.findAll();
	}
	
	@PostMapping("/")
	public Equipo saveEquipo(@RequestBody Equipo equipo) {
		return equipoServicio.saveEquipo(equipo);
	}
	
	@PutMapping("/")
	public Equipo updateEquipo(@RequestBody Equipo equipo) {
		return equipoServicio.updateEquipo(equipo);
	}
	
	@DeleteMapping("/{id}")
	public String deleteEquipo(@PathVariable("id") Integer codigoEquipo) {
		return equipoServicio.deleteEquipo(codigoEquipo);
	}
}
