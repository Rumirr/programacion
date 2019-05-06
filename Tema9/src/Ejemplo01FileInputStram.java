
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
public class Ejemplo01FileInputStram {

    public static void main(String[] args) {
        try {
            // Abrir un archivo de texto (también sería lo mismo para cualquier otro tipo de archivo)
            FileInputStream archivo = new FileInputStream("ficheros/Ejemplo.txt");

            int caracter = 0, contador = 0;
            boolean eof = false;

            while (!eof) {
                caracter = archivo.read();

                if (caracter == -1) {
                    eof = true;
                } else {
                    System.out.print(caracter + " ");
                    contador++;
                }
            }
            System.out.println("\nEl archovo tiene " + contador + " bytes.");

            archivo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejemplo01FileInputStram.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Archivo no encontrado.");
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo01FileInputStram.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error de entrada / salida");
        }
    }

}
