/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesFicherosDeDisco;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo Pereira Kurpel
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        BufferedReader archivo = null;
        try {
            archivo = new BufferedReader(new FileReader("ficheros/contactos.txt"));

            boolean eof = false;
            String linea;

            while (!eof) {
                linea = archivo.readLine();

                if (linea == null) {
                    eof = true;
                } else {

                    String[] contacto = linea.split(",");

                    System.out.println("Apellidos: " + contacto[0]);
                    System.out.println("Nombre: " + contacto[1]);
                    System.out.println("Teléfono: " + contacto[2]);
                    System.out.println("-------");
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio03.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio03.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archivo.close();
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio03.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
}
