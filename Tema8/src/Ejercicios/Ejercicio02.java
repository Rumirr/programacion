/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author horabaixa
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        System.out.println(transforma(14));
    }

    public static String transforma(int dato) {
        String resultado = "";
        
        if (dato == 0) {
            return "0";
        }

        while (dato > 0) {
            resultado = dato % 2 + resultado;
            dato /= 2;
        }

        return resultado;
    }
}
