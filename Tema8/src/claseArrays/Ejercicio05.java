/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author horabaixa
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres1 = new String[5];
        String[] nombres2 = new String[nombres1.length];

        for (int i = 0; i < nombres1.length; i++) {
            System.out.print("Escribe un nombre: ");
            nombres1[i] = scanner.nextLine();
            nombres2[i] = nombres1[i];
        }

        if (Arrays.equals(nombres1, nombres2)) {
            System.out.println("Los arrays son iguales.");
        } else {
            System.out.println("Los arrays no son iguales.");
        }
    }
}
