package com.company;

import javax.swing.*;

public class OperacionesBasicas {
    //declaracion de variables
    int numero1, numero2;
    double resultado;

    public OperacionesBasicas(int numero1, int numero2, double resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }
    public OperacionesBasicas(){

    }

    //crea constructor

    @Override
    public String toString() {
        return "OperacionesBasicas{" +
                "numero1=" + numero1 +
                ", numero2=" + numero2 +
                ", resultado=" + resultado +
                '}';
    }

    public void suma(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un numero" ));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un numero" ));
        resultado = numero1 + numero2;
        JOptionPane.showMessageDialog(null,numero1+"+"+numero2 +" = "+ resultado);
    }
    public void resta(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un numero" ));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un numero" ));
        resultado = numero1 - numero2;
        JOptionPane.showMessageDialog(null,numero1+"-"+numero2 +" = "+ resultado);
    }
    public void division(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un numero" ));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un numero" ));
        resultado = numero1 / numero2;
        JOptionPane.showMessageDialog(null,numero1+"/"+numero2 +" = "+ resultado);
    }
    public void multiplicacion(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un numero" ));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un numero" ));
        resultado = numero1 * numero2;
        JOptionPane.showMessageDialog(null,numero1+"*"+numero2 +" = "+ resultado);
    }
}
