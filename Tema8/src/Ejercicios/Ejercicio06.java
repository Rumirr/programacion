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
public class Ejercicio06 {

    public static void main(String[] args) {

        int[] array = {5, 10, 2, -1, 50, 25, 30,-3};

        System.out.println(min(array, array.length));
    }

    public static int min(int[] array, int elementos) {

//        if (elementos == 1) {
//            return array[0];
//        }
//        
//        return Math.min(array[elementos - 1], min(array, elementos - 1));
        return elementos == 1 ? array[0] : Math.min(array[elementos - 1], min(array, elementos - 1));

    }
}
