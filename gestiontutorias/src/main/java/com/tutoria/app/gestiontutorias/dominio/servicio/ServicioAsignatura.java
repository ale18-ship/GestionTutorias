package com.tutoria.app.gestiontutorias.dominio.servicio;

import com.tutoria.app.gestiontutorias.dominio.modelo.Asignatura;
import com.tutoria.app.gestiontutorias.dominio.repositorio.RepositorioAsignatura;

import java.util.List;
import java.util.Optional;

public class ServicioAsignatura {
    private final RepositorioAsignatura repositorio;

    public ServicioAsignatura(RepositorioAsignatura repositorio) {
        this.repositorio = repositorio;
    }

    public Asignatura crear(Asignatura asignatura) {
        return repositorio.guardar(asignatura);
    }

    public Optional<Asignatura> obtenerPorId(Long id) {
        return repositorio.obtenerPorId(id);
    }

    public List<Asignatura> listar() {
        return repositorio.obtenerTodos();
    }
}
