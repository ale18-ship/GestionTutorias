package com.tutoria.app.gestiontutorias.dominio.repositorio;

import com.tutoria.app.gestiontutorias.dominio.modelo.Tutoria;

import java.util.List;
import java.util.Optional;

public interface RepositorioTutoria {
    Tutoria guardar(Tutoria tutoria);

    Optional<Tutoria> obtenerPorId(Long id);

    List<Tutoria> obtenerTodos();

    List<Tutoria> obtenerPorEstudiante(Long idEstudiante);

    List<Tutoria> obtenerPorDocente(Long idDocente);
}
