/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author horabaixa
 */
public class Factorial {

    /**
     * factorial(5)
     *      5 * factorial(4) 5 * 24 = 120 (Caso recusivo)
     *          4 * factorial(3) 4 * 6 = 24 (Caso recusivo)
     *              3 * factorial(2) = 3 * 2 = 6 (Caso recusivo)
     *                  2 * factorial(1) = 2 * 1 = 2 (Caso recusivo)
     *                          factorial(1) = 1 (Caso base)
     * 
     */
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
//        if (n < 0) {
//            return -1;
//        }
//        
//        if (n == 0) {
//            // caso base
//            return 1;
//        }
//        // caso recursivo
//        return n * factorial(n - 1);

        return n < 0 ? -1 : (n == 0 ? 1 : n * factorial(n - 1));
    }

}
