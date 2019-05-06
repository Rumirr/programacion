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
public class BusquedaBinariaIterativa {
    
    public static void main(String[] args) {
        int[] nums = {5, 7, 10, 20, 35, 37, 40, 42};
        int numBuscado = 22;
        System.out.println("Búscando el elemnto " + numBuscado);
        System.out.println(busquedaBinaria(nums, numBuscado));
    }
    
    public static int busquedaBinaria(int[] datos, int x) {

        // Posición inicial y final del subarray en el que vamos buscar
        int i = 0;
        int f = datos.length - 1;
        int m;
        
        while (i <= f) {
            
            m = (i + f) / 2; // Punto medio del array
            System.out.printf("i = %d, f = %d, m = %d\n", i,f,m);
            if (datos[m] == x) {
                return m;
            } else if (datos[m] < x) {
                i = m + 1;
            } else {
                f = m - 1;
            }
        }
        System.out.printf("i = %d, f = %d\n", i,f);
        return -1;
        
    }
}
