package com.npb.futbol.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npb.futbol.modelos.Equipo;
import com.npb.futbol.repositorio.EquipoRepositorio;

@Service
public class EquiposServicioImpl implements IEquiposServicio {
	@Autowired
	private EquipoRepositorio equiposRepo;
		
	@Override
	public List<Equipo> findAll() {
		return equiposRepo.findAll();
	}

	@Override
	public Equipo saveEquipo(Equipo equipo) {
		return equiposRepo.save(equipo);
	}

	@Override
	public Equipo findEquipoById(Integer codigoEquipo) {
		Optional op = equiposRepo.findById(codigoEquipo);
		if(op.isPresent()) {
			return (Equipo) op.get();
		}
		return null;
	}

	@Override
	public Equipo updateEquipo(Equipo equipo) {
		Optional op = equiposRepo.findById(equipo.getCodigo_equipo());
		if(op.isPresent()) {
			return equiposRepo.save(equipo);
		}
		else {
			System.out.println("Equipo no encontrado");
			return equiposRepo.save(equipo);
		}		
	}

	@Override
	public String deleteEquipo(Integer codigoEquipo) {
		Optional op = equiposRepo.findById(codigoEquipo);
		if(op.isPresent()) {
			equiposRepo.deleteById(codigoEquipo);
			return "Equipo eliminado";
		}
		else {
			return "No es posible borrar el equipo";
		}
	}

}
