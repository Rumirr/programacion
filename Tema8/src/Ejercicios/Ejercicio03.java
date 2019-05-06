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
public class Ejercicio03 {

    public static void main(String[] args) {
        System.out.println(transforma(999));
    }

    public static String transforma(int dato) {
        if (dato < 16) {
            return aHex(dato);
        }

        return transforma(dato / 16) + aHex(dato % 16);
    }

    public static String aHex(int n) {
        String[] numHexa = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        return numHexa[n];
    }
}
