package com.company;

import java.sql.SQLOutput;

public class Directivo extends Empleado{
    public Directivo(String nombre) {
        super(nombre);
        System.out.println("Construyendo directivo");
    }

    @Override
    public String toString() {
        return super.toString()+"---> Directivo";
    }
}
