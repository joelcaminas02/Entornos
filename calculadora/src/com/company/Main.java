package com.company;

import javax.swing.*;

public class Main {
    static String menu;
    static int opcion;
    public static void main(String[] args) {
	// write your code here

    //creo un objeto de la clase operaciones basicas
        OperacionesBasicas op1 = new OperacionesBasicas(2,3,0);
    //System.out.println(op1.toString());
    //OperacionesBasicas op2 = new OperacionesBasicas();
    //System.out.println(op1.toString());
    //System.out.println(op2.toString());
    OperacionesBasicas op3 = new OperacionesBasicas();
    op3.suma();
    op3.resta();
    op3.division();
    op3.multiplicacion();
    OperacionesBasicas clase1 = new OperacionesBasicas();
    do {
        menu = JOptionPane.showInputDialog(null,"Menu principal\n"+"1. Sumar\n 2. Restar\n 3. Dividir\n 4. Multiplicar\n 5.Salir\n");
        opcion = Integer.parseInt(menu);
        switch (opcion){
            case 1:
                op3.suma();
                break;
            case 2:
                op3.resta();
                break;
            case 3:
                op3.division();
                break;
            case 4:
                op3.multiplicacion();
                break;
            case 5:   
                break;
        }
    }while(opcion != 5);
    }
}
