package com.tutoria.app.gestiontutorias.dominio.repositorio;

import com.tutoria.app.gestiontutorias.dominio.modelo.Asignatura;

import java.util.List;
import java.util.Optional;

public interface RepositorioAsignatura {
    Asignatura guardar(Asignatura asignatura);

    Optional<Asignatura> obtenerPorId(Long id);

    List<Asignatura> obtenerTodas();

    boolean existePorNombre(String nombre);

    List<Asignatura> obtenerTodos();
}
