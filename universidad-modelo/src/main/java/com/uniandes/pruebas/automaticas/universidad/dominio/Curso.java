package com.uniandes.pruebas.automaticas.universidad.dominio;

import java.util.List;

public class Curso {

    private String nombre;
    //Inserte aqui la estrategia de nivel de atributo
    private Integer creditos;
    private String codigo;
    private List<Estudiante> estudiantes;

    public String getNombre() {
        return nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
