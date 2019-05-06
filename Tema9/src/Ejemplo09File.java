
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo Pereira Kurpel
 */
// Crea una carpeta de configuración y, dentro de ella, archivo de texto.
public class Ejemplo09File {

    public static void main(String[] args) {
        File carpetaConf = new File("configuracion");
        boolean resultado = carpetaConf.mkdir();

        if (resultado) {
            System.out.println("Carpeta creada.");
        } else {
            System.out.println("No se ha podido crear la carpeta o  ya existe.");
        }

        // Crear un archivo de texto de configuración.
        // Pedro López,25,Palma
        String nombreApellidos = "Pedro López", localidad = "Palma";
        int edad = 25;

        BufferedWriter archivo = null;

        try {
            archivo = new BufferedWriter(new FileWriter(carpetaConf + "/configuracion.txt"));

            archivo.write(String.format("%s,%d,%s", nombreApellidos, edad, localidad));

        } catch (IOException ex) {
            Logger.getLogger(Ejemplo09File.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archivo.close();
            } catch (IOException ex) {
                Logger.getLogger(Ejemplo09File.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
