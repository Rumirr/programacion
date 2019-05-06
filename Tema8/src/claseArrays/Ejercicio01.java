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
public class Ejercicio01 {

    public static void main(String[] args) {

        double[] precios = {6.30, 3.50, 4.95, 2.90, 10, 12.30, 2.45, 4.90, 6.20, 7};
        
        Arrays.sort(precios);
        
        for (double precio : precios) {
            System.out.println(precio);
        }
    }
}
