/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayLists;

import java.util.ArrayList;

/**
 *
 * @author horabaixa
 */
public class Ejemplo01 {

    public static void main(String[] args) {

        ArrayList<Coche> coches = new ArrayList<Coche>();

        // añadir objetos al ArrayList
        Coche c1 = new Coche(1, "2891def", "seat", 12000);
        Coche c2 = new Coche(2, "5001def", "seat", 13000);
        Coche c3 = new Coche(3, "7891def", "seat", 14000);
        Coche c4 = new Coche(4, "7891def", "seat", 15000);

        coches.add(c1);
        coches.add(c2);
        coches.add(c3);

        // mostrar el contenido del arrayList
        for (Coche coche : coches) {
            System.out.println(coche.toString());
        }

        // añadir objetos indicando donde quieres que se coloquen
        System.out.println();
        coches.add(0, c4);
        for (Coche coche : coches) {
            System.out.println(coche.toString());
        }

        // buscar un elemento en el arrayList
        // método inmediato: buscar el identificador
        System.out.println();
        int idBuscado = 4;

        for (Coche coche : coches) {
            if (coche.getId() == idBuscado) {
                System.out.println("El elemto buscado está en la posición " + coches.indexOf(coche));
                break;
            }
        }

        // borrar un elemto
        System.out.println();

        int idBorrar = 2;
        coches.remove(idBorrar);
        
        for (Coche coche : coches) {
            System.out.println(coche.toString());
        }

        // ¿Cúanto elementos hay guardado en la lista?
        System.out.println("");
        System.out.println("Hay " + coches.size() + " coches guardados.");
        
        // borrar un coche
        System.out.println();
        
        Coche cBorrar = new Coche(1, "2891def", "seat", 12000);
        
        if(coches.remove(cBorrar)){
            System.out.println("Coche borrado");
        }
                
        
        for (Coche coche : coches) {
            System.out.println(coche.toString());
        }
    }
}
