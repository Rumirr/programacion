/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayLists;

import java.util.Objects;

/**
 *
 * @author horabaixa
 */
public class Coche {

    private int id;
    private String matricula;
    private String marca;
    private double precio;

    public Coche(int id, String matricula, String marca, double precio) {
        this.id = id; 
        this.matricula = matricula;
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" + "id=" + id + ", matricula=" + matricula + ", marca=" + marca + ", precio=" + precio + '}';
    }

    @Override
    public boolean equals(Object obj) {
        Coche coche = (Coche) obj;

        if (this.matricula.equalsIgnoreCase(coche.getMatricula())) {
            return true;
        }
        return false;
    
    }

    public String getMatricula() {
        return matricula;
    }   
    
    public int getId() {
        return id;
    }

    
}
