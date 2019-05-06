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
public class Ejercicio07 {

    public static void main(String[] args) {
        System.out.println(invertir(456));
    }

    public static String invertir(int n) {

        if (n < 10 && n > 0) {
            return n % 10 + "";
        } else if (n < 0) {
            return "-" + invertir(-n);

        } else {
            return n % 10 + invertir(n / 10);
        }
    }
}
