
import java.io.File;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Pereira Kurpel
 */
public class Ejemplo13 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int opcion = fileChooser.showOpenDialog(null);
        
        if (opcion == JFileChooser.CANCEL_OPTION) {
            System.out.println("Has cancelado.");
            return;
        }
        
        File archivo = fileChooser.getSelectedFile();
        System.out.println("Archivo eligido: " + archivo.toString());
    }
}
