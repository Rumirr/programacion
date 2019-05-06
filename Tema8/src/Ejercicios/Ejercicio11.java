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
public class Ejercicio11 {

    public static void main(String[] args) {
        double[] nums = {25, 35.5, 35};
        System.out.println(max(nums, nums.length));
    }

    public static double max(double[] lista, int n) {
//        if (n == 1) {
//            return lista[0];
//        }
//
//        return Math.max(lista[n - 1], max(lista, n - 1));

        return (n == 1) ? lista[0] : Math.max(lista[n - 1], max(lista, n - 1));
    }
}
