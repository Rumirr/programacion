
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
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
public class Ejemplo06Buffer {

    public static void main(String[] args) {
        try {
            BufferedInputStream archivoLeer = new BufferedInputStream(new FileInputStream("ficheros/Ejemplo.txt"));
            BufferedOutputStream archivoCopia = new BufferedOutputStream(new FileOutputStream("ficheros/EjemploCopiaBuffer.txt"));
            
            boolean eof = false;
            byte caracter = 0;
            
            
            while (!eof) {                
                caracter = (byte) archivoLeer.read();
                
                
                if (caracter == -1) {
                    eof = true;
                }else{
                    archivoCopia.write(caracter);
                }
            }
            
            
            archivoLeer.close();
            archivoCopia.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejemplo06Buffer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo06Buffer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
