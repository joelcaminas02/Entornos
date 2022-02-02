package com.company;

public class Oficial extends Operario{
    private String titulo;
    public Oficial(String nombre, String titulo) {
        super(nombre);
        this.titulo = titulo;
        System.out.println("Construyendo ofical");
    }

    @Override
    public String toString() {
        return super.toString()+"----> Oficial "+titulo;
    }
}
