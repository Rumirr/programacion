
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo Pereira Kurpel
 */
public class Ejemplo11 {

    public static void main(String[] args) {
        File carpeta = new File("img/jpg/alta");

        borrar(carpeta);
        carpeta = new File(carpeta.getParent());
        borrar(carpeta);
        carpeta = new File(carpeta.getParent());
        borrar(carpeta);
    }

    public static void borrar(File carpeta) {
        if (carpeta.delete()) {
            System.out.println("Carpeta " + carpeta.getName() + " borrada.");
        } else {
            System.out.println("Carpeta" + carpeta.getName() + " no borrada.");
        }
    }
}
