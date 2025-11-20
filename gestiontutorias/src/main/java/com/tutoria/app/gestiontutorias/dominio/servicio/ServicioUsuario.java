package com.tutoria.app.gestiontutorias.dominio.servicio;

import com.tutoria.app.gestiontutorias.dominio.modelo.Usuario;
import com.tutoria.app.gestiontutorias.dominio.repositorio.RepositorioUsuario;

import java.util.List;
import java.util.Optional;

public class ServicioUsuario {
    private final RepositorioUsuario repositorioUsuario;

    public ServicioUsuario(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public Usuario crearUsuario(Usuario usuario) {
        return repositorioUsuario.guardar(usuario);
    }

    public Optional<Usuario> obtenerPorId(Long id) {
        return repositorioUsuario.obtenerPorId(id);
    }

    public List<Usuario> listarUsuarios() {
        return repositorioUsuario.obtenerTodos();
    }
}
