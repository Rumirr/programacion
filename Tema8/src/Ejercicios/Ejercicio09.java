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
public class Ejercicio09 {

    public static void main(String[] args) {
        int[] nums = {4, 6, 10};
        System.out.println(sumar(nums, nums.length));
    }

    /**
     * Suma todos los valores de un array de números enteros.
     *
     * @param lista Array de números enteros.
     * @param n Tamaño del array.
     * @return Suma de todos los elementos del array.
     */
    public static int sumar(int[] lista, int n) {

//        if (n == 1) {
//            return lista[0];
//        }
//        return lista[n - 1] + sumar(lista, n - 1);
        return (n == 1) ? lista[0] : lista[n - 1] + sumar(lista, n - 1);

    }
}
