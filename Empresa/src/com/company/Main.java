package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Empleado e1 = new Empleado("Jose Ruiz Lopez");
        System.out.println(e1.toString());

        Operario op1 = new Operario("Carla");
        System.out.println(op1.toString());

        Directivo di1= new Directivo("Carlos");
        System.out.println(di1.toString());
        Oficial of1 = new Oficial(" Carla", "Grado Superiro");
        System.out.println(of1.toString());
        Tecnico tc1 = new Tecnico(" Paco", " Grado Universitario");
        System.out.println(tc1);
    }
}
