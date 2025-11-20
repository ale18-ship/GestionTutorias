package com.tutoria.app.gestiontutorias.dominio.modelo;

public class Tutoria {
    private Long id;
    private String fecha;
    private String horaInicio;
    private String horaFin;
    private String lugar;
    private boolean esGrupal;

    private Docente docente;
    private Estudiante estudiante;
    private Asignatura asignatura;
}
