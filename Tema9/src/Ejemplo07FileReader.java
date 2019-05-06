
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public class Ejemplo07FileReader {

    public static void main(String[] args) {
        BufferedReader archivo = null;
        try {
//            FileReader archivo = new FileReader("ficheros/Ejemplo.txt");
            archivo = new BufferedReader(new FileReader("ficheros/Ejemplo.txt"));

            boolean eof = false;
            String linea;

            while (!eof) {
                linea = archivo.readLine();

                if (linea == null) {
                    eof = true;
                } else {
                    System.out.println(linea);
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejemplo07FileReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo07FileReader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archivo.close();
            } catch (IOException ex) {
                Logger.getLogger(Ejemplo07FileReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
