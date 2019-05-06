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
public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] precios = {6.30, 3.50, 4.95, 2.90, 10, 12.30, 2.45, 4.90, 6.20, 7};

        Arrays.sort(precios);

        System.out.print("Escribe un número: ");
        double numero = scanner.nextDouble();

        int index = Arrays.binarySearch(precios, numero);
        if (index < 0) {
            System.out.println("No ha encontrado ningún precio que coincida con el número introducido.");
        } else {
            System.out.println("Se ha encontrado el precio en la posicion: " + index);
        }

    }
}
