package com.npb.futbol.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npb.futbol.modelos.Equipo;

public interface EquipoRepositorio extends JpaRepository<Equipo, Integer> {

}
