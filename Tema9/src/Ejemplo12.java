
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public class Ejemplo12 {

    public static void main(String[] args) {
        String archivoOriginal = "ficheros/Ejemplo_M.txt";
        String archivoTmp = "ficheros/Ejemplo_M.txt.tmp";
        boolean eof = false;
        String linea = "";

        File origen = new File(archivoOriginal);
        File tmp = new File(archivoTmp);

        BufferedReader or = null;
        BufferedWriter newOr = null;

        try {
            or = new BufferedReader(new FileReader(origen));
            newOr = new BufferedWriter(new FileWriter(tmp));

            while (!eof) {
                linea = or.readLine();
                if (linea == null) {
                    eof = true;
                } else {
                    newOr.write(linea.toUpperCase());
                    newOr.newLine();
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejemplo12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo12.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                or.close();
                newOr.close();
                
                if (origen.delete()) {
                    tmp.renameTo(origen);
                }
            } catch (IOException ex) {
                Logger.getLogger(Ejemplo12.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
