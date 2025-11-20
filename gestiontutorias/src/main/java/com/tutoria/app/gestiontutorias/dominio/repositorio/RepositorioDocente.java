package com.tutoria.app.gestiontutorias.dominio.repositorio;

import com.tutoria.app.gestiontutorias.dominio.modelo.Docente;

import java.util.List;
import java.util.Optional;

public interface RepositorioDocente {
    Docente guardar(Docente docente);

    Optional<Docente> obtenerPorId(Long id);

    List<Docente> obtenerTodos();

    boolean existePorCorreo(String correo);
}
