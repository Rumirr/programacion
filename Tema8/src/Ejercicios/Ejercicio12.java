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
public class Ejercicio12 {

    public static void main(String[] args) {
//        char[] frase = {'a', 'l', 'b'};
        char[] frase = {'A', 'L', 'L', 'I', 'V', 'E', 'S', 'S', 'E', 'V', 'I', 'L', 'L', 'A'};
        System.out.println(esPalindromo(frase));
    }

    public static boolean esPalindromo(char[] frase) {
        return esPalindromo(frase, 0, frase.length - 1);
    }

    public static boolean esPalindromo(char[] frase, int inicio, int fin) {
        if (frase[inicio] != frase[fin]) {
            return false;
        } else if (inicio < fin) {
            return esPalindromo(frase, inicio + 1, fin - 1);
        }
        return true;
    }
}
