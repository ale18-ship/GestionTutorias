package com.tutoria.app.gestiontutorias.dominio.repositorio;

import com.tutoria.app.gestiontutorias.dominio.modelo.Usuario;

import java.util.List;
import java.util.Optional;

public interface RepositorioUsuario {
    Usuario guardar(Usuario usuario);

    Optional<Usuario> obtenerPorId(Long id);

    List<Usuario> obtenerTodos();

    boolean existePorCorreo(String correo);
}
