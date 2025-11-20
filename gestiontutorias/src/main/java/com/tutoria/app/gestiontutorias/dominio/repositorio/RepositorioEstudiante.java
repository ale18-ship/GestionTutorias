package com.tutoria.app.gestiontutorias.dominio.repositorio;

import com.tutoria.app.gestiontutorias.dominio.modelo.Estudiante;

import java.util.List;
import java.util.Optional;

public interface RepositorioEstudiante {
    Estudiante guardar(Estudiante estudiante);

    Optional<Estudiante> obtenerPorId(Long id);

    List<Estudiante> obtenerTodos();

    boolean existePorCorreo(String correo);
}
