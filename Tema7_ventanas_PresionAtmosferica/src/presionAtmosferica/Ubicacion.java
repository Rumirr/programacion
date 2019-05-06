/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presionAtmosferica;

/**
 * Clase que representa una ubicación, que consta de un nombre de localidad, una
 * altitud y una unidad que indica la unidad de la altitud.
 *
 * @author Gustavo Pereira Kurpel
 */
public class Ubicacion {

    private String localidad;
    private float altitud;
    private String unidad;

    /**
     * Contructor de la clase
     * @param ubicacion Nombre de la localidad que se creará.
     * @param altitud Altitud de la localidad.
     * @param unidad Unidades en la cual se mide la altitud.
     */
    
    public Ubicacion(String ubicacion, float altitud, String unidad) {
        this.localidad = ubicacion;
        this.altitud = altitud;
        this.unidad = unidad;
    }

    
    /**
     * 
     * @return Localidad - Altitud (Unidad)
     */
    @Override
    public String toString() {
        //return ubicacion + " - " + altitud + unidad;
        return String.format("%s - %.2f (%s)", localidad, altitud, unidad);

    }

    public float getAltitud() {
        return altitud;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getUnidad() {
        return unidad;
    }

}
