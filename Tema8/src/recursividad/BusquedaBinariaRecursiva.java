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
public class BusquedaBinariaRecursiva {

    public static void main(String[] args) {
        int[] nums = {-2, 5, 7, 10, 20, 35,-2, 37, 40, 42};
        int numBuscado = -2;
        System.out.println("Búscando el elemnto " + numBuscado);
        System.out.println(busquedaBinaria(nums, numBuscado));
    }

    /**
     * Busca el número x en array lista
     *
     * @param datos Array de enteros donde haremos la búsqueda.
     * @param x Número a buscar
     * @return Posición en el array que ocupa x, o -1 si no se encuentra.
     */
    public static int busquedaBinaria(int[] datos, int x) {
        return busquedaBinaria(datos, 0, datos.length - 1, x);
    }

    /**
     * Busca el número x en array lista
     *
     * @param datos Array de enteros donde haremos la búsqueda.
     * @param i Posición inicial del array desde donde buscaremos.
     * @param f Posición final del array hasta donde buscaremos.
     * @param x Número a buscar
     * @return Posición en el array que ocupa x, o -1 si no se encuentra.
     */
    public static int busquedaBinaria(int[] datos, int i, int f, int x) {
        if (i > f) {
            return -1;
        }

        int m = (i + f) / 2;

        if (datos[m] == x) {
            return m;
        } else if (datos[m] < x) {
            return busquedaBinaria(datos, m + 1, f, x);
        } else {
            return busquedaBinaria(datos, i, m - 1, x);
        }

    }

}
