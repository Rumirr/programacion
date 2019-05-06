/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author Gustavo Pereira Kurpel
 */
public class Euclides {

    public static void main(String[] args) {
        System.out.println(mcd(15, 20));

    }

    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }

}
