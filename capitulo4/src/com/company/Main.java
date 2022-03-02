package com.company;

import java.util.Scanner;

/**
 * @author Joel Carrillero Garcia
 * @version 1.0.4
 */
public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el número para la criba de Erastótenes:");
        int numero=teclado.nextInt();
        int vector[]=new int[numero];
        System.out.println("\nVector inicial hasta :"+numero);
        imprimir(vector);
        vector=generarPrimos(numero);
        System.out.println("\nVector de primos hasta:"+numero);
        imprimirVectorFinal(vector);
    }
    /**
     *
     * @param vector es el array de vectores
     * @return imprime el array de vectores Finales
     */
    private static void imprimirVectorFinal(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i%10==0) System.out.println();
            System.out.print(vector[i]+"\t");
        }
    }
    /**
     *
     * @param vector es el array de vectores
     * @return imprime el array de vectores
     */
    private static void imprimir(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (i%10==0) System.out.println();
            System.out.print(i+1+"\t");
        }
    }

    // Generar números primos de 1 a max

    /**
     *
     * @param max es el maximo al que puede llegar
     * @return el vectores de primo del numero que introduzcas
     */
    public static int[] generarPrimos (int max)
    {
        int i,j;
        if (max >= 2) {
            // Declaraciones
            int dim = max + 1; // Tamaño del array
            boolean[] esPrimo = new boolean[dim];
            // Inicializar el array
            for (i=0; i<dim; i++)
                esPrimo[i] = true;
            // Eliminar el 0 y el 1, que no son primos
            esPrimo[0] = esPrimo[1] = false;
            // Criba
            for (i=2; i<Math.sqrt(dim)+1; i++) {
                if (esPrimo[i]) {
                    // Eliminar los múltiplos de i
                    for (j=2*i; j<dim; j+=i)
                        esPrimo[j] = false;
                }
            }

            // ¿Cuántos primos hay?
            int cuenta = 0;
            for (i=0; i<dim; i++) {
                if (esPrimo[i])
                    cuenta++;
            }

            // Rellenar el vector de números primos
            int[] primos = new int[cuenta];
            for (i=0, j=0; i<dim; i++) {
                if (esPrimo[i])
                    primos[j++] = i;
                }
                    return primos;
                } else { // max < 2
                     return new int[0];
            // Vector vacío
        }
    }
}
