/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesFicherosDeDisco;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo Pereira Kurpel
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del archivo a hacer una copia: ");
        String nombreArchivo = scanner.nextLine();
        FileInputStream archivoOriginal = null;
        FileOutputStream archivoCopiado = null;
        try {
            archivoOriginal = new FileInputStream("ficheros/" + nombreArchivo);

            nombreArchivo = addCopia(nombreArchivo);

            archivoCopiado = new FileOutputStream("ficheros/" + nombreArchivo);

            boolean eof = false;
            byte caracter = 0;

            while (!eof) {
                caracter = (byte) archivoOriginal.read();

                if (caracter == -1) {
                    eof = true;
                } else {
                    archivoCopiado.write(caracter);
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(Ejercicio01.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archivoOriginal.close();
                archivoCopiado.close();
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio01.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static String addCopia(String s) {
        int posPunto = s.lastIndexOf(".");
        return s.substring(0, posPunto) + ".copia" + s.substring(posPunto, s.length());

    }

}
