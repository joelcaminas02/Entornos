package com.company;

public class Operario extends Empleado{

    public Operario (String nombre){
        super (nombre);
        System.out.println("Contrsuyendo operario");
    }

    @Override
    public String toString() {
        return super.toString()+"----> Operario";
    }
}
