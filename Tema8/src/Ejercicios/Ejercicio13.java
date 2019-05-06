/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author horabaixa
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        System.out.println("Escribe una frase y te diré si es un palíndromo:");
        frase = scanner.nextLine();

        System.out.println(esPalindromo(frase));
    }

    public static boolean esPalindromo(String frase) {
        frase.replaceAll(" ", "");
        return esPalindromo(frase, 0, frase.length() - 1);
    }

    public static boolean esPalindromo(String frase, int inicio, int fin) {
          
//        if (frase.toLowerCase().charAt(inicio) != frase.toLowerCase().charAt(fin)) {
//            return false;
//        } else if (inicio < fin) {
//           return esPalindromo(frase, inicio + 1, fin - 1);
//        }
//
//        return true;

         return (frase.toLowerCase().charAt(inicio) != frase.toLowerCase().charAt(fin)) ? false : ((inicio < fin) ? esPalindromo(frase, inicio + 1, fin - 1) : true);
    }
}
