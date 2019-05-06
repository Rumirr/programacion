/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesFicherosDeDisco;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo Pereira Kurpel
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombre, apellidos, telefono, contacto = "";

        System.out.println("Añandir contactos a la lista de contactos");
        System.out.println("===============================================\n");

        BufferedWriter archivo = null;

        try {
            archivo = new BufferedWriter(new FileWriter("ficheros/contactos.txt", true));
            for (int i = 0; i < 3; i++) {

                System.out.println("Contacto " + (i + 1));
                System.out.println("____________________");
                System.out.print("Nombre: ");
                nombre = scanner.nextLine();
                System.out.print("Apellidos: ");
                apellidos = scanner.nextLine();
                System.out.print("Teléfono: ");
                telefono = scanner.nextLine();
                System.out.println();
                contacto = String.format("%s,%s,%s\n", apellidos, nombre, telefono);

                archivo.write(contacto);
            }
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio02.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archivo.close();
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio02.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
