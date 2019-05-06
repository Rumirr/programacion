
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
public class Ejemplo04Decodificador {

    public static void main(String[] args) {
        try {
            FileInputStream archivoCodificado = new FileInputStream("ficheros/Ejemplo_codificado.txt");
            FileOutputStream archivoDecodificado = new FileOutputStream("ficheros/Ejemplo_decodificado.txt");

            boolean eof = false;
            int caracter = 0;

            while (!eof) {
                caracter = archivoCodificado.read();

                if (caracter == -1) {
                    eof = true;
                } else {
                    caracter--;
                    if (caracter == -1) {
                        caracter = 255;
                    }
                    archivoDecodificado.write(caracter);
                }

            }

            archivoCodificado.close();
            archivoDecodificado.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejemplo04Decodificador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo04Decodificador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
