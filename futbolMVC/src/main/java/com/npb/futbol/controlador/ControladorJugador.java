package com.npb.futbol.controlador;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.npb.futbol.modelos.Equipo;
import com.npb.futbol.modelos.Jugador;
import com.npb.futbol.servicios.EquiposServicioImpl;
import com.npb.futbol.servicios.JugadoresServicioImpl;

@Controller
@RequestMapping("/jugadores")
public class ControladorJugador {
	@Autowired
	JugadoresServicioImpl jugadoresServicio;
	@Autowired
	EquiposServicioImpl equiposServicio;
	
	@GetMapping("/")
	public String findAllJugadores(Model model) {
		List<Jugador> jugadores = jugadoresServicio.findAll();
		model.addAttribute("jugadores", jugadores);
		return "jugadores/tablaJugadores";
	}
	
	@GetMapping("/create")
	public String formJugador(Model model, Jugador j) {
		List<Equipo> equipos = equiposServicio.findAll();
		model.addAttribute("jugador", j);
		model.addAttribute("equipos", equipos);
		return "jugadores/formJugador";
	}
	
	@PostMapping("/save")
	public String saveJugador(Jugador j) {
		System.out.println(j.toString());
		jugadoresServicio.saveJugador(j);
		return "redirect:/jugadores/";
	}
	
	@GetMapping("/delete")
	public String eliminar(@RequestParam("id") int id) {
		jugadoresServicio.deleteJugador(id);
		System.out.println("Jugador: " + id + " eliminado");
		return "redirect:/jugadores/";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(format, false));
	}
 }
