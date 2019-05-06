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
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String titulo, encabezado, contenido;

        System.out.print("Título de la página: ");
        titulo = scanner.nextLine();
        System.out.print("Encabezado de la página: ");
        encabezado = scanner.nextLine();
        System.out.print("Contenido de la página: ");
        contenido = scanner.nextLine();

        String html = "<!DOCTYPE html>"
                + "\n<html lang=\"es-ES\">"
                + "\n<head>"
                + "\n<title>" + titulo + "</title>"
                + "\n<meta charset=\"utf-8\">"
                + "\n</head>"
                + "\n<body>"
                + "\n<h1>" + encabezado + "</h1>"
                + "\n<p>" + contenido + "</p>"
                + "\n</body>"
                + "\n</html>";

        BufferedWriter archivo = null;
        try {
            archivo = new BufferedWriter(new FileWriter(System.getProperty("user.home") + "/index.html"));

            archivo.write(html);
            System.out.println("Se ha creado la página en tu carpeta personal. De nada.");

        } catch (IOException ex) {
            Logger.getLogger(Ejercicio04.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archivo.close();
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio04.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
