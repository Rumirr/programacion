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
public class Ejercicio01 {

    public static void main(String[] args) {
        System.out.println(transforma(14));
    }

    public static String transforma(int dato) {
//        if (dato < 2) {
//            return dato + "";
//        }
//        return transforma(dato / 2) + dato % 2;

        
        return dato < 2 ? dato + "" : transforma(dato / 2) + dato % 2;
    }
}
