
import java.io.BufferedWriter;
import java.io.FileWriter;
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
public class Ejemplo08 {

    public static void main(String[] args) {
        String frase1 = "Gustavo Pereira Kurpel";
        String frase2 = "Informatica";

        BufferedWriter archivo = null;

        try {
            archivo = new BufferedWriter(new FileWriter("ficheros/EjemploBufferWrite.txt"));

            archivo.write(frase1);
            
            archivo.newLine();
            archivo.write(frase2);

        } catch (IOException ex) {
            System.out.println("ERROR");
            Logger.getLogger(Ejemplo08.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                archivo.close();
            } catch (IOException ex) {
                System.out.println("ERROR");
                Logger.getLogger(Ejemplo08.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
