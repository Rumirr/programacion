/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesFicherosDeDisco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo Pereira Kurpel
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreArchivo, paquete = "";

        System.out.print("Nombre del paquete: ");
        paquete = scanner.nextLine();
        System.out.print("Nombre del archivo: ");
        nombreArchivo = scanner.nextLine();

        BufferedReader archivo = null;
        try {
            archivo = new BufferedReader(new FileReader(String.format("%s/%s", paquete, nombreArchivo)));

            boolean eof = false;
            String linea;
            int br = 0, ca = 0;
            while (!eof) {
                linea = archivo.readLine();
                if (linea == null) {
                    eof = true;
                } else {
                    if (!linea.equals("")) {
                        br += contarApariciones(linea, "break");
                        ca += contarApariciones(linea, "case");
                    }

                }

            }
            if (br > ca) {
                System.out.println("Hay más breaks que cases." + br);
            } else if (br < ca) {
                System.out.println("Hay más cases que breaks." + ca);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio05.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio05.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archivo.close();
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio05.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static int contarApariciones(String linea, String palabra) {
        int numApariciones = 0;
        int pos = linea.indexOf(palabra, 0);

        while (pos >= 0) {
            numApariciones++;
            pos = linea.indexOf(palabra, pos + palabra.length());
        }
        return numApariciones;
    }
}
