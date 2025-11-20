package com.tutoria.app.gestiontutorias.dominio.servicio;

import com.tutoria.app.gestiontutorias.dominio.modelo.Estudiante;
import com.tutoria.app.gestiontutorias.dominio.repositorio.RepositorioEstudiante;

import java.util.List;
import java.util.Optional;

public class ServicioEstudiante {
    private final RepositorioEstudiante repositorio;

    public ServicioEstudiante(RepositorioEstudiante repositorio) {
        this.repositorio = repositorio;
    }

    public Estudiante registrar(Estudiante estudiante) {
        return repositorio.guardar(estudiante);
    }

    public Optional<Estudiante> obtenerPorId(Long id) {
        return repositorio.obtenerPorId(id);
    }

    public List<Estudiante> listar() {
        return repositorio.obtenerTodos();
    }
}
