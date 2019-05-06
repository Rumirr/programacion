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
public class Ejercicio04 {

    public static void main(String[] args) {
        System.out.println(divideYVenceras(24, 6));
    }

    public static int divideYVenceras(int dividendo, int divisor) {
//        if (dividendo < divisor) {
//            return 0;
//        }
//        return divideYVenceras(dividendo - divisor, divisor) + 1;

        return dividendo < divisor ? 0 : divideYVenceras(dividendo - divisor, divisor) + 1;

    }
}
