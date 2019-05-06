/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 * n f(n) = f(n-1) + f(n-2); n = 0  f(0) = 1; n = 1  f(1) = 1
 *
 *
 * @author horabaixa
 */
public class Fibonacci {

    public static void main(String[] args) {

        int n = 10;
        System.out.println("El termino " + n + " es " + fibonacci(n));

    }

    public static double fibonacci(int n) {
//        if (n < 0) {
//            return -1;
//        } else if (n == 0 || n == 1) {
//            return 1;
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2);

        return n < 0 ? -1 : ((n == 0 || n == 1) ? 1 : fibonacci(n - 1) + fibonacci(n - 2));

    }
}
