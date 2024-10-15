package com.javieranova.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javieranova.modelos.Cancion;

@Repository
public interface RepositorioCanciones extends JpaRepository<Cancion, Long> {
    // No es necesario declarar este método, ya que JpaRepository ya lo proporciona
    // List<Cancion> findAll(); 
}
