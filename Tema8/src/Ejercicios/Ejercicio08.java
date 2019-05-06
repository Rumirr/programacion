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
public class Ejercicio08 {

    public static void main(String[] args) {
        System.out.println(sumar(456));
    }

    public static int sumar(int n) {
//        if (n < 10) {
//            return n;
//        }
//    
//        return n%10 + sumar(n/10);

        return (n < 10) ? n : n % 10 + sumar(n / 10);
    }
}
