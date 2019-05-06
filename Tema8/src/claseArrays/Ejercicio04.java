/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseArrays;

import java.util.Arrays;

/**
 *
 * @author horabaixa
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        double[] notas = {5, 8, 4, 9, 10, 8, 2, 4};
        double[] primerasNotas = Arrays.copyOfRange(notas, 0, 4);

        System.out.println("Notas: " + Arrays.toString(notas));
        System.out.println("Primeras notas: " + Arrays.toString(primerasNotas));
    }
}
