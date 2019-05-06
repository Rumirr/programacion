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
public class Ejercicio10 {

    public static void main(String[] args) {
        int[] nums = {4, 6};

        System.out.println(multiplicar(nums, nums.length));
    }

    public static int multiplicar(int[] lista, int n) {
//        if (n == 1) {
//            return lista[0];
//        }
//
//        return lista[n - 1] * multiplicar(lista, n - 1);

        return (n == 1) ? lista[0] : lista[n - 1] * multiplicar(lista, n - 1);
    }
}
