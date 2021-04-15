package com.example.clase_05;

import java.util.Objects;

public class PersonaModel {

    private String nombre;
    private String apellido;
    private Integer dni;
    private String sexo;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }
    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public PersonaModel(){

    }

    public PersonaModel(String nombre, String apellido, int dni, String sexo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = new Integer(dni);
        this.sexo = sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaModel persona = (PersonaModel) o;
        return nombre.equals(persona.nombre) &&
                apellido.equals(persona.apellido) &&
                dni.equals(persona.dni) &&
                sexo.equals(persona.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, dni, sexo);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
