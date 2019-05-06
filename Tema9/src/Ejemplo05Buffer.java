
import java.io.BufferedInputStream;
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
public class Ejemplo05Buffer {

    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("ficheros/Ejemplo.txt");
            BufferedInputStream buffer = new BufferedInputStream(archivo);

            boolean eof = false;
            byte caracter = 0;

            while (!eof) {
                caracter = (byte) buffer.read();

                if (caracter == -1) {
                    eof = true;
                } else {
                    System.out.print(caracter + " ");
                }
            }

            buffer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejemplo05Buffer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo05Buffer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
