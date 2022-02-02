package com.company;

public class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    //recibir nombre
    public String getNombre() {
        return nombre;
    }
    //modificar nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado" + nombre;
    }
}
