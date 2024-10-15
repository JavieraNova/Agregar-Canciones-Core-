package com.javieranova.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javieranova.modelos.Cancion;
import com.javieranova.repositorios.RepositorioCanciones;

@Service
public class ServicioCanciones {
    
    @Autowired
    private RepositorioCanciones repositorioCanciones;

    // Obtener todas las canciones de la base de datos
    public List<Cancion> obtenerTodasLasCanciones() {
        return repositorioCanciones.findAll();
    }

    // Obtener una canción por su ID
    public Cancion obtenerCancionPorId(Long id) {
        Optional<Cancion> cancion = repositorioCanciones.findById(id);
        return cancion.orElse(null); 
    }

    // Agregar una nueva canción a la base de datos
    public Cancion agregarCancion(Cancion cancion) {
        return repositorioCanciones.save(cancion); 
    }
}
