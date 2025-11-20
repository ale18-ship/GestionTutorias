package com.tutoria.app.gestiontutorias.dominio.servicio;

import com.tutoria.app.gestiontutorias.dominio.modelo.Docente;
import com.tutoria.app.gestiontutorias.dominio.repositorio.RepositorioDocente;

import java.util.List;
import java.util.Optional;

public class ServicioDocente {
    private final RepositorioDocente repositorio;

    public ServicioDocente(RepositorioDocente repositorio) {
        this.repositorio = repositorio;
    }

    public Docente registrar(Docente docente) {
        return repositorio.guardar(docente);
    }

    public Optional<Docente> obtenerPorId(Long id) {
        return repositorio.obtenerPorId(id);
    }

    public List<Docente> listar() {
        return repositorio.obtenerTodos();
    }
}
