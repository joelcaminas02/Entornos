package com.company;

public class Tecnico extends Operario{
    private String titulo;
    public Tecnico(String nombre, String titulo) {
        super(nombre);
        this.titulo = titulo;
        System.out.println("Contruyendo Tecnico");
    }

    @Override
    public String toString() {
        return super.toString()+"----> Tecnico"+ titulo;
    }
}
