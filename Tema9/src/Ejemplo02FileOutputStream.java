
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
public class Ejemplo02FileOutputStream {
    
    public static void main(String[] args) {
        try {
            FileInputStream archivoOriginal = new FileInputStream("ficheros/Ejemplo.txt");
            FileOutputStream archivoCopia = new FileOutputStream("ficheros/Ejemplo_copia.txt");
            
            boolean eof = false;
            int caracter = 0;
            
            while (!eof) {                
                caracter = archivoOriginal.read();
                
                if (caracter == -1) {
                    eof = true;
                } else {
                    archivoCopia.write(caracter);
                }
                
            }
            
            archivoOriginal.close();
            archivoCopia.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejemplo02FileOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo02FileOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
